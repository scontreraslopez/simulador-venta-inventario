package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.theme.SimuladorVentaInventarioTheme

/**
 * Project: Simulador Venta Inventario
 * From: net.iessochoa.sergiocontreras.simuladorventainventario.ui.components
 * Created by: Contr
 * On: 02/11/2026
 * Creado en Settings -> Editor -> File and Code Templates
 */

// Saludo del mercader: cambia según si el jugador ya ha seleccionado items.
@Composable
fun SaludoMercader(
    haySeleccion: Boolean,
    modifier: Modifier = Modifier
) {
    val texto = if (haySeleccion) "Interesante propuesta..." else "Bienvenido, Exile"

    Text(
        text = texto,
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )
}

@Preview(showBackground = true)
@Composable
fun SaludoMercaderInicioPreview() {
    SimuladorVentaInventarioTheme {
        SaludoMercader(haySeleccion = false)
    }
}

@Preview(showBackground = true)
@Composable
fun SaludoMercaderPropuestaPreview() {
    SimuladorVentaInventarioTheme {
        SaludoMercader(haySeleccion = true)
    }
}
