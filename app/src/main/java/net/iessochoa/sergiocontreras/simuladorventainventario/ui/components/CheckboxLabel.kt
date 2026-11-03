package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Checkbox con una etiqueta de texto a su derecha, centrados verticalmente.
 *
 * **Viene de fábrica**: es el mismo componente del tema y no se evalúa.
 * Úsalo tal cual desde `CheckboxGrid`; no hace falta modificarlo.
 *
 * Es un componente sin estado: no recuerda si está marcado. Quien lo usa le dice
 * si está marcado ([isChecked]) y recibe un aviso cuando el usuario lo pulsa
 * ([onCheckedChange]).
 *
 * @param label Texto que se muestra junto al checkbox, p. ej. `"Espada del Exiliado - 75g"`.
 * @param isChecked `true` si el checkbox debe aparecer marcado.
 * @param onCheckedChange Se llama al pulsar el checkbox, con el nuevo valor que tendría.
 * @param modifier Modifier que se aplica a la fila completa (checkbox + texto).
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