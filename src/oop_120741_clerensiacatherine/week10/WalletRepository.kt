package oop_120741_clerensiacatherine.week10


class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter {
            it is NamedEntity && it.name.contains(name, ignoreCase = true)
        }
    }
}