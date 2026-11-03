package net.iessochoa.sergiocontreras.simuladorventainventario.ui.components

/*
 * ============================================================================
 *  SeccionBotones: botones de acción de la venta
 * ============================================================================
 *
 *  QUÉ SE PIDE
 *  -----------
 *  Un composable con dos botones del ancho completo, uno debajo del otro y
 *  con una pequeña separación entre ellos:
 *
 *      ┌─────────────────────────────┐
 *      │       Confirmar Venta       │   ← color primario (el de por defecto)
 *      └─────────────────────────────┘
 *      ┌─────────────────────────────┐
 *      │       Cancelar Venta        │   ← color secundario
 *      └─────────────────────────────┘
 *
 *  NIVELES
 *  -------
 *  - Básico: los dos botones se ven con sus textos.
 *  - Avanzado: cada botón muestra su Toast.
 *      · Confirmar Venta → "Transacción solicitada"
 *      · Cancelar Venta  → "Inventario limpiado"
 *  - Excelente: además, los dos botones dejan el formulario como al principio
 *    (nada seleccionado).
 *
 *  PISTAS
 *  ------
 *  - Este componente NO sabe qué pasa al pulsar: recibe una lambda por cada
 *    botón (p. ej. `onVenderClick: () -> Unit`) y la llama en el `onClick`.
 *    El Toast y la limpieza se hacen en la pantalla (MainScreen), que es
 *    quien tiene el estado y el `Context`.
 *  - Para que el segundo botón tenga otro color, pásale `colors`:
 *
 *        colors = ButtonDefaults.buttonColors(
 *            containerColor = MaterialTheme.colorScheme.secondaryContainer,
 *            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
 *        ),
 *
 *  - Los textos de los botones van en `strings.xml` y se leen con
 *    `stringResource(...)`.
 *  - Acepta un `modifier: Modifier = Modifier` y añade una `@Preview` con
 *    lambdas vacías `{ }`.
 */
