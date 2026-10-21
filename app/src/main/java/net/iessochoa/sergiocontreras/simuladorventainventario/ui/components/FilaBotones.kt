package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SeccionBotones(
    onVenderClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        //Comprobar cupon
        Button(
            onClick = onVenderClick
        ) {
            Text("Confirmar Venta")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun SeccionBotonesPreview()  = SeccionBotones({ }, modifier = Modifier.fillMaxWidth(), )