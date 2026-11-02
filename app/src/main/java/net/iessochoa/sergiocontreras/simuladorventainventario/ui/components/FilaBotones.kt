package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.theme.SimuladorVentaInventarioTheme

@Composable
fun SeccionBotones(
    onVenderClick: () -> Unit,
    onLimpiarClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
    )
    {
        //Comprobar cupon
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onVenderClick
        ) {
            Text("Confirmar Venta")
        }
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer
            ),            onClick = onLimpiarClick
        ) {
            Text("Cancelar Venta")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun SeccionBotonesPreview()  {
    SimuladorVentaInventarioTheme() {
        SeccionBotones(
            onVenderClick = { },
            modifier = Modifier.fillMaxWidth(),
            onLimpiarClick = { },
        )
    }
}