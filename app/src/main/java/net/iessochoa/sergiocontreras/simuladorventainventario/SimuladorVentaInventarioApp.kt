package net.iessochoa.sergiocontreras.simuladorventainventario

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens.MainScreen
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.theme.SimuladorVentaInventarioTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimuladorVentaInventarioApp() {
    SimuladorVentaInventarioTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { CenterAlignedTopAppBar(title = { Text("Panel de Comercio") }) }
        ) { innerPadding ->
            MainScreen(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp))
        }
    }
}