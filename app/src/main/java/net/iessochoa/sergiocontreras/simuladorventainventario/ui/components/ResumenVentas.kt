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
import androidx.compose.ui.res.stringResource
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
        stringResource(R.string.mensaje_venta_vacia),
        stringResource(R.string.mensaje_venta_items, totalOro, numItems),
    )

    @DrawableRes val imagenRes: Int
    val mensaje: String
    val descripcionImagen: String

    when {
        totalOro > 0 -> {
            imagenRes = R.drawable.premio_dinero
            mensaje = mensajes[1]
            descripcionImagen = "Bolsa de oro"
        }
        else -> {
            imagenRes = R.drawable.sin_premio_monedero
            mensaje = mensajes[0]
            descripcionImagen = "Monedero vacío"
        }
    }

    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = imagenRes),
            contentDescription = descripcionImagen,
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


