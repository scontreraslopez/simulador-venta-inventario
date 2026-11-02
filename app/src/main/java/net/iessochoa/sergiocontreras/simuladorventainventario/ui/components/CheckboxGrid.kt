package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.data.InventoryRepository
import net.iessochoa.sergiocontreras.simuladorventainventario.model.InventarioItem

/**
 * Project: Simulador Venta Inventario
 * From: net.iessochoa.sergiocontreras.simuladorventainventario.ui.components
 * Created by: Contr
 * On: 30/10/2026 at 11:41
 * Creado en Settings -> Editor -> File and Code Templates
 */

// Matrix rows x 2cols de checkboxes.
@Composable
fun CheckboxGrid(
    listaInventario: List<InventarioItem>,
    itemsSeleccionados: List<InventarioItem>,
    onCheckedChange: (InventarioItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        for (i in listaInventario.indices step 2) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                if(i < listaInventario.size) {
                    //Pintar el izquierdo
                    val itemLeft = listaInventario[i]

                    CheckboxLabel(
                        label = "${itemLeft.nombre} - ${itemLeft.precio}g",
                        modifier = Modifier.width(200.dp),
                        isChecked = itemLeft in itemsSeleccionados,
                        onCheckedChange = {onCheckedChange(itemLeft)}
                    )

                }
                if(i+1 < listaInventario.size) {
                    //Pintar el derecho
                    val itemRight = listaInventario[i+1]
                    Spacer(
                        modifier = Modifier.weight(1f)
                    )

                    CheckboxLabel(
                        label = "${itemRight.nombre} - ${itemRight.precio}g",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(end = 16.dp),
                        isChecked = itemRight in itemsSeleccionados,
                        onCheckedChange = {onCheckedChange(itemRight)}
                    )
                }
            }
        }
    }
}

@Preview(showBackground=true)
@Composable
fun CheckboxGridPreview() {
    val repository = InventoryRepository
    val items = repository.getAllItems()
    CheckboxGrid(
        listaInventario = items,
        itemsSeleccionados = emptyList(),
        onCheckedChange = {},
    )
}
