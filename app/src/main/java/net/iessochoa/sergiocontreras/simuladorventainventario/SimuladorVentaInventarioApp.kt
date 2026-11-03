package net.iessochoa.sergiocontreras.simuladorventainventario

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens.MainScreen
import net.iessochoa.sergiocontreras.simuladorventainventario.ui.theme.SimuladorVentaInventarioTheme

/**
 * Raíz de la app: aplica el tema y monta el `Scaffold` con la pantalla principal.
 *
 * TODO (Avanzado): añade una barra superior al `Scaffold` con el título
 * "Panel de Comercio" (`R.string.top_bar_titulo`).
 *
 *  - El `Scaffold` tiene un parámetro `topBar = { ... }`.
 *  - Puedes usar `TopAppBar` o `CenterAlignedTopAppBar` (título centrado).
 *  - Son APIs experimentales: el IDE te pedirá añadir
 *    `@OptIn(ExperimentalMaterial3Api::class)` sobre la función.
 *  - Dale al título un estilo del tema, p. ej. `MaterialTheme.typography.titleLarge`.
 *  - No borres el `.padding(innerPadding)`: es lo que evita que la barra tape
 *    el contenido.
 */
@Composable
fun SimuladorVentaInventarioApp() {
    SimuladorVentaInventarioTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
        ) { innerPadding ->
            MainScreen(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding))
        }
    }
}
