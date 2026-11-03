package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
    itemsSeleccionados: Set<InventarioItem>,
    onCheckedChange: (InventarioItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        for (i in listaInventario.indices step 2) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                // Pintar el izquierdo (siempre existe: i está dentro de indices)
                val itemLeft = listaInventario[i]
                CheckboxLabel(
                    label = "${itemLeft.nombre} - ${itemLeft.precio}g",
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 4.dp),
                    isChecked = itemLeft in itemsSeleccionados,
                    onCheckedChange = { onCheckedChange(itemLeft) }
                )

                if (i + 1 < listaInventario.size) {
                    // Pintar el derecho
                    val itemRight = listaInventario[i + 1]
                    CheckboxLabel(
                        label = "${itemRight.nombre} - ${itemRight.precio}g",
                        modifier = Modifier
                            .weight(1f)
                            .padding(vertical = 4.dp),
                        isChecked = itemRight in itemsSeleccionados,
                        onCheckedChange = { onCheckedChange(itemRight) }
                    )
                } else {
                    // Lista impar: hueco vacío para que el izquierdo no ocupe toda la fila
                    Spacer(modifier = Modifier.weight(1f))
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
        itemsSeleccionados = emptySet(),
        onCheckedChange = {},
    )
}
