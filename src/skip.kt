/**
 * Kotlin 有三种结构化跳转表达式
 * Created by whyte on 2017/6/28.
 */
fun main(args: Array<String>) {

    //用标签限制break
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5 && i == 2)
                break@loop
            println("$i--$j")
        }
    }

    fun foo() {
        (1..6).forEach a@ {
            if (it == 0) {
                return@a
            }
            print(it)
        }
    }

    foo()
}
