package net.iessochoa.sergiocontreras.simuladorventainventario.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/*
 * ============================================================================
 *  MainScreen: la pantalla de comercio
 * ============================================================================
 *
 *  QUÉ SE PIDE
 *  -----------
 *  Esta pantalla monta los componentes de `ui.components` y es la ÚNICA que
 *  guarda el estado. Los componentes solo pintan y avisan.
 *
 *  Orden de arriba abajo:
 *
 *      SaludoMercader
 *      ResumenVentas
 *      CheckboxGrid
 *      SeccionBotones
 *
 *  Pon `Spacer`s entre los elementos para que la pantalla respire, p. ej.
 *  `Spacer(modifier = Modifier.height(16.dp))`. Juega con las alturas hasta
 *  que quede bien.
 *
 *  SUGERENCIA DE PASOS
 *  -------------------
 *  1. Datos: pide la lista de items a `InventoryRepository`.
 *
 *  2. Estado: guarda qué items están seleccionados.
 *
 *  3. Al pulsar un checkbox: si el item ya estaba, se quita; si no, se añade.
 *     Pásale esa lambda a `CheckboxGrid`.
 *
 *  4. Datos derivados, calculados a partir del estado en cada recomposición
 *     (no hace falta guardarlos en otro `remember`):
 *       - número de items seleccionados  → Básico
 *       - total de oro (`sumOf { it.precio }`) → Avanzado
 *       - ¿hay algo seleccionado? (`isNotEmpty()`) → Avanzado / Excelente
 *
 *  5. Botones: pásale a `SeccionBotones` una lambda por botón.
 *       - Avanzado: mostrar el Toast con
 *         `Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()`.
 *       - Excelente: además, dejar la selección vacía.
 *
 *  PISTAS PARA LOS TOAST
 *  ---------------------
 *  - El `Context` se obtiene con `val context = LocalContext.current`.
 *  - `stringResource(...)` es `@Composable`: NO se puede llamar dentro de un
 *    `onClick`. Lee el texto ANTES, fuera de la lambda, y guárdalo en una `val`.
 */
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TODO: monta aquí la pantalla
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() = MainScreen(
    modifier = Modifier.fillMaxSize()
)
