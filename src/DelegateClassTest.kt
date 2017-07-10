/**
 * Created by Whyte on 2017/7/10.
 */
fun main(args: Array<String>) {
    P3(P1()).print()//输出 p1
    P3(P2()).print()//输出 p2
}

interface P {
    fun print()
}

class P1 : P {
    override fun print() {
        println("p1")
    }
}

class P2 : P {
    override fun print() {
        println("p2")
    }
}

//超类型列表中的by子句表示b将会在 P3 中内部存储，并且编译器将生成转发给b的所有P的方法。
class P3(b: P) : P by b



