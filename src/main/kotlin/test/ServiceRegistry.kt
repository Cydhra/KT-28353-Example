package test

import java.util.*

fun main() {
    ServiceRegistry.loadServices()
}

object ServiceRegistry {

    fun loadServices() {
        val pluginLoader = ServiceLoader.load(ServiceProvider::class.java, this.javaClass.classLoader)
        val iterator = pluginLoader.iterator()
        check(iterator.hasNext()) { "iterator is empty" }
        iterator.forEach { println("Loaded provider: ${it.name}") }
    }

}