package net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.model.InventarioItem
import net.iessochoa.sergiocontreras.simuladorventainventario.data.InventoryRepository
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.CheckboxGrid
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.ResumenVentas
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.SeccionBotones

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    val repository = InventoryRepository
    val allItems = repository.getAllItems()

    var selectedItems by remember { mutableStateOf(setOf<InventarioItem>()) }

    var onCheckChange: (InventarioItem) -> Unit = {
        if (selectedItems.contains(it)) {
            selectedItems = selectedItems - it
        } else {
            selectedItems = selectedItems + it
        }
    }

    
    Column(
        modifier = modifier.padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Simulador Venta") //ESTO ES TOP APP BAR
        ResumenVentas(
            total = "150"
        )
        CheckboxGrid(
            listaInventario = allItems,
            itemsSeleccionados = selectedItems.toList(),
            onCheckedChange = onCheckChange,
        )
        SeccionBotones(
            onVenderClick = {  },
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
