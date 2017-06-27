/**
 * Created by whyte on 2017/6/27.
 */
fun main(args: Array<String>) {
    println("sum of 3 and 5 is " + sumReturnInt(3, 5))
    println("sum of 3 and 5 is " + sumReturnInt1(4, 5))
    println("sum of 19 and 23 is ${sumReturnVar(19, 23)}")
    printSum(1, 2)
    reformat("1")
    defaultParam(arrayOf("a", "b", "c"))
    val list = asList(1, 2, 3, 4)
    print(list)

    reformat("1")

    reformat("1", true, true, false, '_')

    reformat("1", b = true,
            c = true,
            d = false,
            e = '_'
    )

    reformat("1", e = '_')
}

fun sumReturnInt(a: Int, b: Int): Int {
    return a + b;
}

fun sumReturnInt1(a: Int, b: Int): Int = a + b;

fun sumReturnVar(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


fun defaultParam(b: Array<String>, off: Int = 0, len: Int = b.size) {
    println("len is " + len)
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

fun reformat(a: String,
             b: Boolean = true,
             c: Boolean = true,
             d: Boolean = false,
             e: Char = ' ') {
}