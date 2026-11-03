package net.iessochoa.sergiocontreras.simuladorventainventario.model

/**
 * Un objeto del inventario del jugador que se puede vender al mercader.
 *
 * Al ser una `data class`, dos items con el mismo [nombre] y [precio] se consideran
 * **iguales** (`==`). Por eso funcionan bien dentro de un `Set` o con `contains`/`in`.
 *
 * > Pista: para saber si un checkbox debe salir marcado, pregunta si su item está
 * > dentro de tu colección de seleccionados (`item in seleccionados`).
 *
 * @property nombre Nombre que se muestra en la etiqueta del checkbox.
 * @property precio Oro (g) que ofrece el mercader por este objeto.
 */
data class InventarioItem(
    val nombre: String,
    val precio: Int
)
