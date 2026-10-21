package net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.BannerPremio
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.CuponComprobar
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.CuponGanador
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.components.FilaBotones

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("MI LOTERO KOTLIN") //ESTO ES TOP APP BAR
        Text("Cupon Ganador: ")
        CuponGanador(
            numero = "12345",
            serie = "11",
            mostrar = true
        )
        BannerPremio(
        )
        CuponComprobar(
            numero = "12345",
            serie = "22",
            onNumeroChange = { } ,
            onSerieChange = { }
        )
        FilaBotones(
            onComprobarClick = {  },
            onLimpiarClick = { }
        )

        /*


        Text("TITULO")
        Text("Resumen Transaccion: ")
        Text("Recibes 150g")
        Text("Vende tu inventario")
        Text("Espada oxidada - 20g)
        Text("Taza rota - 1g)
        Text("...")
        Text("Confirmar")
        Text("Limpiar")
             */

    }
}




@Preview(showBackground = true)
@Composable
fun MainScreenPreview() = MainScreen(
    modifier = Modifier.fillMaxSize()
)
