package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.R

@Composable
fun ResumenVentas(
    total: String,
    modifier: Modifier = Modifier
) {
    val totalNum = total.toIntOrNull() ?: 0
    if (totalNum > 0) {
        Column(
            modifier = modifier
        ) {
            val totalNum = total.toIntOrNull() ?: 0
            val imagenRes = when {
                totalNum > 0 -> R.drawable.premio_dinero
                else -> R.drawable.sin_premio_monedero
            }

            Image(
                painter = painterResource(id = imagenRes),
                contentDescription = "Imagen de oro",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text("Vender por ${totalNum}g")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResumenVentasPreview() {
    ResumenVentas(
        total = "150",
        modifier = Modifier
    )
}