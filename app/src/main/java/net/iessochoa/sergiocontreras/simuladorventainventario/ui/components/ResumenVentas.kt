package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

/*
 * ============================================================================
 *  ResumenVentas: lo que ofrece el mercader por la selección
 * ============================================================================
 *
 *  QUÉ SE PIDE
 *  -----------
 *  Un composable con una imagen centrada y, debajo, un mensaje:
 *
 *              ┌─────────┐
 *              │ imagen  │
 *              └─────────┘
 *      Te ofrezco 130g por los 2 items
 *
 *  Según haya o no algo seleccionado:
 *
 *  | Situación          | Imagen                         | Mensaje                              |
 *  |--------------------|--------------------------------|--------------------------------------|
 *  | Nada seleccionado  | R.drawable.sin_premio_monedero | "No puedo ofrecerte nada por eso..." |
 *  | Algo seleccionado  | R.drawable.premio_dinero       | "Te ofrezco Xg por los N items"      |
 *
 *  X = suma de los precios de los items seleccionados.
 *  N = número de items seleccionados.
 *
 *  LAS IMÁGENES YA ESTÁN IMPORTADAS en `res/drawable-nodpi/`:
 *  `premio_dinero.png` y `sin_premio_monedero.png`. No tienes que añadir nada,
 *  solo usarlas con `painterResource(R.drawable.xxx)`.
 *
 *  NIVELES
 *  -------
 *  - Básico: imagen y mensaje visibles. El mensaje muestra al menos cuántos
 *    items hay seleccionados (vale la imagen fija).
 *  - Avanzado: el mensaje incluye el total de oro, y la imagen y el mensaje
 *    cambian según haya algo seleccionado o no.
 *
 *  PISTAS
 *  ------
 *  - Este componente NO calcula nada ni guarda estado: recibe los datos ya
 *    calculados por parámetro (p. ej. `totalOro: Int`, `numItems: Int`). Los
 *    cálculos se hacen en la pantalla (MainScreen).
 *  - Para decidir qué imagen y qué mensaje toca, basta con un `if` o un `when`.
 *  - Los textos ya están en `strings.xml`. El de la oferta lleva huecos para
 *    los números (`%1$d`, `%2$d`); se rellenan pasándolos a `stringResource`:
 *
 *        stringResource(R.string.mensaje_venta_items, totalOro, numItems)
 *
 *  - `Image` necesita un `contentDescription` para la accesibilidad.
 *  - Acepta un `modifier: Modifier = Modifier` y añade dos `@Preview`: una
 *    sin selección y otra con selección.
 */
