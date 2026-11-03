package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

/*
 * ============================================================================
 *  CheckboxGrid: grid de checkboxes con el inventario del jugador
 * ============================================================================
 *
 *  QUÉ SE PIDE
 *  -----------
 *  Un composable que pinte un checkbox por cada objeto del inventario.
 *  La etiqueta de cada checkbox tiene este formato:
 *
 *      Nombre del item - Preciog        →   "Espada del Exiliado - 75g"
 *
 *  NIVELES
 *  -------
 *  - Básico y Avanzado: vale con UNA columna (un checkbox debajo de otro).
 *  - Excelente (9-10): hace falta pintarlo a DOS columnas. Si el número de
 *    items es impar, el último ocupa solo su mitad de la fila; no se estira.
 *
 *  PISTAS
 *  ------
 *  - Ya tienes `CheckboxLabel` en este mismo paquete: un Checkbox con su texto.
 *    Reutilízalo, no lo vuelvas a escribir.
 *  - Este componente NO guarda estado (nada de `remember` aquí dentro). Recibe
 *    por parámetro:
 *      · la lista de items que hay que pintar,
 *      · cuáles están seleccionados,
 *      · una lambda para avisar de que el usuario ha pulsado un item.
 *    El estado vive en la pantalla (MainScreen), que es quien decide qué hacer.
 *  - Un checkbox está marcado si su item está entre los seleccionados.
 *  - Para dos columnas tienes varias opciones: `LazyVerticalGrid` con
 *    `GridCells.Fixed(2)`, o recorrer la lista de dos en dos montando `Row`s
 *    dentro de una `Column`. Con `Modifier.weight(1f)` cada celda ocupa la
 *    mitad de la fila.
 *  - Ojo: un `LazyVerticalGrid` dentro de una `Column` con `verticalScroll`
 *    rompe la app (altura infinita).
 *  - Acepta un `modifier: Modifier = Modifier` y añade una `@Preview` que use
 *    `InventoryRepository.getAllItems()`.
 */
