/**
 * Created by Whyte on 2017/7/4.
 */
fun main(args: Array<String>) {
    val ab: L = object : L(1), J {
        override val x: Int = 2
        override val y = 15
    }
   println(ab.y)
}

open class L(x: Int) {
    open val y: Int = x
}

interface J {
    val x: Int
}

