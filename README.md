# Simulador de Venta de Inventario

Parcial 1 de **Programación Multimedia y Dispositivos Móviles** (PMDM), curso 2026-2027, grupo 2K, **Modelo A**.

Eres el mercader de un juego de rol (inspirado en *Path of Exile*). El jugador marca los objetos de su inventario que quiere venderte y tú le dices cuánto oro le das por ellos. Es una app de **una sola pantalla** hecha con Jetpack Compose y Material 3.

## Estructura del repositorio

Este repositorio contiene el examen del Parcial 1 (Modelo A) de PMDM.

- `main` → solución de referencia
- `starter` → código inicial que recibió el alumnado, con el enunciado (`ENUNCIADO.md`) y la captura de referencia

Para intentarlo por tu cuenta: `git checkout starter`

> El enunciado completo, con la rúbrica, solo está en la rama `starter`. Léelo antes de mirar la solución.

## Qué se evalúa

El examen no pide "una app que funcione" sin más: pide una app **bien troceada**. Lo que se mira es si sabes separar la UI en componentes, elevar el estado y derivar datos de él.

### Requisitos críticos

Si falta alguno, la nota máxima es un 4 aunque la app funcione:

- Componentes separados en `ui.components` (mínimo tres de los cuatro: `SaludoMercader`, `ResumenVentas`, `CheckboxGrid`, `SeccionBotones`).
- Nada de UI en `MainActivity`; la pantalla se compone en `ui.screens.MainScreen`.
- Padding global de 8 dp.
- El proyecto compila y arranca.

### Niveles acumulativos

La nota va por niveles, y **un nivel solo cuenta si el anterior está completo**:

| Nivel     | Nota máx. | Qué añade |
|-----------|-----------|-----------|
| Básico    | 5  | Todos los componentes en pantalla y el número de items seleccionados actualizándose al marcar |
| Avanzado  | 8  | `Scaffold` + TopAppBar, Toasts, total de oro calculado, imagen dinámica |
| Excelente | 10 | Saludo dinámico, botones que limpian la selección, grid a dos columnas |

Sobre esa nota se aplica un ajuste de ±1 punto por buenas y malas prácticas: textos en `strings.xml`, state hoisting, `modifier` en cada componente, `@Preview`, nombres claros… frente a estado dentro de los componentes, datos del inventario copiados a mano, valores mágicos o código muerto.

## El código de partida (`starter`)

La rama `starter` no está vacía. Trae:

- El modelo (`InventarioItem`) y el repositorio (`InventoryRepository`) ya hechos.
- `CheckboxLabel`, un checkbox con etiqueta listo para reutilizar.
- Los ficheros de los componentes y de `MainScreen` con **comentarios guía**: qué se pide, una sugerencia de pasos y pistas para los puntos donde se suele atascar la gente (por ejemplo, los Toast).
- Algunos textos ya metidos en `strings.xml` y las imágenes `sin_premio_monedero` y `premio_dinero`.

La idea es que el examen mida cómo se estructura y se conecta la UI, no cuánto tiempo se tarda en escribir código repetitivo.

## Claves de la solución

- **Estado mínimo.** Lo único que se guarda es un `Set<InventarioItem>` con los objetos seleccionados, en `MainScreen`. El número de items, el total de oro (`sumOf { it.precio }`) y si hay selección (`isNotEmpty()`) se calculan a partir de él en cada recomposición, sin más `remember`.
- **State hoisting.** Los componentes de `ui.components` no tienen estado propio: reciben valores por parámetro y avisan con lambdas (`onCheckedChange`, `onVenderClick`, `onLimpiarClick`).
- **Toasts y `stringResource`.** `stringResource` es `@Composable` y no se puede llamar dentro de un `onClick`, así que los mensajes se leen antes, fuera de la lambda, y se guardan en una `val`.
- **Grid a dos columnas sin `LazyVerticalGrid`.** `CheckboxGrid` recorre la lista de dos en dos y pinta cada fila con un `Row`. Si el número de objetos es impar, un `Spacer` con `weight(1f)` ocupa el hueco para que el último no se estire. La rúbrica acepta `LazyVerticalGrid` "o equivalente"; con cinco objetos no hace falta un componente perezoso, y así no hay que pelearse con un scroll anidado dentro de la `Column`.
- **`Scaffold` en la app.** `SimuladorVentaInventarioApp` monta el tema, el `Scaffold` y la `CenterAlignedTopAppBar`, y le pasa a `MainScreen` el `innerPadding` más los 8 dp de margen.

## Estructura del código

```
app/src/main/java/net/iessochoa/sergiocontreras/simuladorventainventario/
├── MainActivity.kt                  # Solo llama a SimuladorVentaInventarioApp()
├── SimuladorVentaInventarioApp.kt   # Tema + Scaffold + TopAppBar
├── data/InventoryRepository.kt      # Lista de objetos a la venta
├── model/InventarioItem.kt          # nombre + precio
└── ui/
    ├── screens/MainScreen.kt        # Estado y composición de la pantalla
    └── components/
        ├── SaludoMercader.kt        # "Bienvenido, Exile" / "Interesante propuesta..."
        ├── ResumenVentas.kt         # Imagen + "Te ofrezco Xg por los N items"
        ├── CheckboxGrid.kt          # Grid de 2 columnas
        ├── CheckboxLabel.kt         # Checkbox con etiqueta (proporcionado)
        └── FilaBotones.kt           # SeccionBotones: Confirmar / Cancelar
```

## Cómo ejecutarlo

Abre el proyecto en Android Studio y ejecútalo en un emulador o dispositivo con Android 8.0 (API 26) o superior. Cada componente tiene su `@Preview`, así que también puedes revisarlos desde el panel de diseño sin arrancar la app.
