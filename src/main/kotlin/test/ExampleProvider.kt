package test

import com.google.auto.service.AutoService

/**
 * Example implementation of [ServiceProvider] that should be loaded by [ServiceRegistry]
 */
@AutoService(ServiceProvider::class)
class ExampleProvider : ServiceProvider {
    override val name: String = "Hello World Service"
}