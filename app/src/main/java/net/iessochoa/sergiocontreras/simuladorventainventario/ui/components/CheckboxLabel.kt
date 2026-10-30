package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Project: Simulador Venta Inventario
 * From: net.iessochoa.sergiocontreras.simuladorventainventario.ui.components
 * Created by: Contr
 * On: 22/10/2026 at 00:15
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun CheckboxLabel(
    label: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange
        )
        Text(text = label)
    }

}

@Preview(showBackground = true)
@Composable
fun CheckboxLabelPreview()  = CheckboxLabel(
    label = "Ejemplo de Checkbox",
    isChecked = true,
    onCheckedChange = {}
)