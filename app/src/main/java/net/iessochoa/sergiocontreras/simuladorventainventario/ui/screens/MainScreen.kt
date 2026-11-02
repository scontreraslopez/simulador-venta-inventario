package net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.data.InventoryRepository
import net.iessochoa.sergiocontreras.simuladorventainventario.model.InventarioItem
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.CheckboxGrid
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.ResumenVentas
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.SaludoMercader
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.SeccionBotones

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    val repository = InventoryRepository
    val allItems = repository.getAllItems()

    var selectedItems by remember { mutableStateOf(setOf<InventarioItem>()) }

    val onCheckChange: (InventarioItem) -> Unit = {
        selectedItems = if (selectedItems.contains(it)) {
            selectedItems - it
        } else {
            selectedItems + it
        }
    }

    val totalOro = selectedItems.sumOf { it.precio }
    val context = LocalContext.current


    
    Column(
        modifier = modifier.padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SaludoMercader(haySeleccion = selectedItems.isNotEmpty())
        Spacer(modifier = Modifier.height(16.dp))
        ResumenVentas(
            totalOro = totalOro,
            numItems = selectedItems.size
        )
        Spacer(modifier = Modifier.height(32.dp))
        CheckboxGrid(
            listaInventario = allItems,
            itemsSeleccionados = selectedItems,
            onCheckedChange = onCheckChange,
        )
        Spacer(modifier = Modifier.height(32.dp))
        SeccionBotones(
            onVenderClick = {
                Toast.makeText(context, "Transacción solicitada", Toast.LENGTH_SHORT).show()
            },
            onLimpiarClick = {
                selectedItems = setOf()
                Toast.makeText(context, "Inventario limpiado", Toast.LENGTH_SHORT).show()
            }
        )

        /*


        Text("TITULO")
        Text("Resumen Transaccion: ")
        Text("Recibes 150g")
        Text("Vende tu inventario")
        Text("Espada oxidada - 20g)
        Text("Taza rota - 1g)
        Text("...")
        Text("Confirmar")
        Text("Limpiar")
             */

    }
}




@Preview(showBackground = true)
@Composable
fun MainScreenPreview() = MainScreen(
    modifier = Modifier.fillMaxSize()
)
