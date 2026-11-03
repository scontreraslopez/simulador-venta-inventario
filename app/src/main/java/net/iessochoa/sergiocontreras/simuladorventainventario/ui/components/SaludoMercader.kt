package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

/*
 * ============================================================================
 *  SaludoMercader: saludo del mercader al jugador
 * ============================================================================
 *
 *  QUÉ SE PIDE
 *  -----------
 *  Un composable con un texto destacado: grande, en negrita y con el color
 *  primario del tema. Va arriba del todo, encima del resumen de venta.
 *
 *  | Situación          | Texto                       |
 *  |--------------------|-----------------------------|
 *  | Nada seleccionado  | "Bienvenido, Exile"         |
 *  | Algo seleccionado  | "Interesante propuesta..."  |
 *
 *  NIVELES
 *  -------
 *  - Básico y Avanzado: vale con un saludo fijo ("Bienvenido, Exile").
 *  - Excelente: el saludo cambia según haya algo seleccionado o no.
 *
 *  PISTAS
 *  ------
 *  - Este componente NO sabe qué hay seleccionado: recibe por parámetro lo
 *    justo para decidir qué texto mostrar (p. ej. `haySeleccion: Boolean`).
 *  - Para el estilo, tira del tema en vez de poner tamaños a mano:
 *    `style = MaterialTheme.typography.headlineSmall`,
 *    `color = MaterialTheme.colorScheme.primary`,
 *    `fontWeight = FontWeight.Bold`.
 *  - Los textos ya están en `strings.xml` (`bienvenida_no_venta`, `bienvenida_venta`).
 *  - Acepta un `modifier: Modifier = Modifier` y añade una `@Preview` por cada
 *    saludo.
 */
