package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
    totalOro: Int,
    numItems: Int,
    modifier: Modifier = Modifier
) {

    val mensajes = listOf(
        "No puedo ofrecerte nada por eso...",
        "Te ofrezco ${totalOro}g por los $numItems items",
    )

    @DrawableRes var imagenRes: Int
    var mensaje: String

    Column(
        modifier = modifier
    ) {
        when {
            totalOro > 0 -> {
                imagenRes = R.drawable.premio_dinero
                mensaje = mensajes[1]
            }
            else -> {
                imagenRes = R.drawable.sin_premio_monedero
                mensaje = mensajes[0]
            }
        }

        Image(
            painter = painterResource(id = imagenRes),
            contentDescription = "Imagen de oro",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(mensaje)
    }

}

@Preview(showBackground = true)
@Composable
fun ResumenVentasPreview() {
    ResumenVentas(
        totalOro = 220,
        numItems = 3
    )
}


@Preview(showBackground = true)
@Composable
fun ResumenVentasPreview2() {
    ResumenVentas(
        totalOro = 0,
        numItems = 0
    )
}


