import java.lang.Integer.parseInt

/**
 * 控制流
 * Created by Whyte on 2017/6/28.
 */
fun main(args: Array<String>) {

    val a: Int = 1
    val b: Int = 3
    val max = if (a > b) a else b
    println(max)


    //if作为表达式
    val max1 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max1)

    //普通的when
    val x: Int = 2
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个,像switch的default
            println("x is neither 1 nor 2")
        }
    }

    //作为表达式的when
    val s = when (x) {
        1 -> {
            println("x == 1")
            1
        }
        2 -> {
            println("x == 2")
            2
        }
        else -> {
            println("x is neither 1 nor 2")
            3
        }
    }
    println(s)

    //一个分支满足多个条件时
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    //可以用任意表达式（而不只是常量）作为分支条件
    val g: String = "1"
    when (x) {
        parseInt(g) -> println("s encodes x")
        else -> println("s does not encode x")
    }

    //in 关键字
    val validNumbers: Array<Int> = arrayOf(30, 5)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    //检测一个值是（is）或者不是（!is）一个特定类型的值
    fun hasStr(v: Any) = when (v) {
        !is String -> true
        else -> false
    }
    println(hasStr("1"))

    val array = arrayOf(1, 2, 3, 4)
    //通过索引遍历一个数组或者一个 list
    for (i in array.indices) {
        print(array[i])
    }

    //访问索引和对应的值
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}