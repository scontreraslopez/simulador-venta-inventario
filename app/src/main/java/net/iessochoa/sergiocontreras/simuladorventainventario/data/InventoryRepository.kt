package net.iessochoa.sergiocontreras.simuladorventainventario.data

import net.iessochoa.sergiocontreras.simuladorventainventario.model.InventarioItem

/**
 * Project: Simulador Venta Inventario
 * From: net.iessochoa.sergiocontreras.simuladorventainventario.data
 * Created by: Contr
 * On: 30/10/2026 at 12:20
 * Creado en Settings -> Editor -> File and Code Templates
 */
object InventoryRepository {

    private val itemList = listOf(
        InventarioItem("Espada del Exiliado", 75),
        InventarioItem("Arco de Ceniza", 55),
        InventarioItem("Amuleto de los Ancestros", 90),
        InventarioItem("Botas de Cuero Rúnicas", 35),
        InventarioItem("Orbe del Caos", 8)
    )

    fun getAllItems() = itemList
    fun getRandomItem() = itemList.random()
    fun getFirstItem() = itemList.first()


}