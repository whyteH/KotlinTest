/**
 * Created by Whyte on 2017/7/4.
 */
fun main(args: Array<String>) {
    val p = User("Whyte", 18)
    println(p)
    println(p.name + " is " + p.age)
    val (name, age) = p
    println(name + " is " + age)
    
    val newP = p.copy(age = 19)
    println(newP.name + " is " + newP.age)


}

data class User(val name: String, val age: Int)