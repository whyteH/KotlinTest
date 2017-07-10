import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by Whyte on 2017/7/7.
 */
fun main(args: Array<String>) {
    val a = Example()
    println(a.p)
    a.p = "a"
    println(a.p)

    println(lazyValue)
    println(lazyValue)

    val user = U()
    user.name = "first"
    user.name = "second"

    val user1 = U1()
    user1.name = "first"
    user1.name = "second"

    val user2 = User1(mapOf(
            "name" to "John Doe",
            "age" to 25
    ))

    println(user2.name) // Prints "John Doe"
    println(user2.age)  // Prints 25

}

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

val lazyValue: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    println("computed!")
    "Hello"
}

class U {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

class U1 {
    var name: String by Delegates.vetoable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
        false
    }
}

class User1(map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}