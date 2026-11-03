package net.iessochoa.sergiocontreras.simuladorventainventario.data

import net.iessochoa.sergiocontreras.simuladorventainventario.model.InventarioItem

/**
 * Fuente de datos del inventario del jugador.
 *
 * Es un `object` (singleton): no hace falta crear instancias, se usa directamente
 * como `InventoryRepository.getAllItems()`.
 *
 * > Pista: **no copies estos datos en la UI**. Pide la lista al repositorio desde la
 * > pantalla y pásasela al componente que pinta los checkboxes. Si mañana cambia el
 * > inventario, la UI no debería tener que tocarse.
 */
object InventoryRepository {

    private val itemList = listOf(
        InventarioItem("Espada del Exiliado", 75),
        InventarioItem("Arco de Ceniza", 55),
        InventarioItem("Amuleto de los Ancestros", 90),
        InventarioItem("Botas de Cuero Rúnicas", 35),
        InventarioItem("Orbe del Caos", 8)
    )

    /**
     * Devuelve todos los objetos del inventario, en el orden en que deben mostrarse.
     *
     * @return Lista inmutable de [InventarioItem].
     */
    fun getAllItems(): List<InventarioItem> = itemList

    /**
     * Devuelve un objeto cualquiera del inventario. Útil para `@Preview`.
     */
    fun getRandomItem(): InventarioItem = itemList.random()

    /**
     * Devuelve el primer objeto del inventario. Útil para `@Preview`.
     */
    fun getFirstItem(): InventarioItem = itemList.first()
}
