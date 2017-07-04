/**
 * Created by Whyte on 2017/7/4.
 */
fun main(args: Array<String>) {
    var i: Int = 1
    //对象表达式，相当于java中的匿名内部类
    val a: Any = object : Person(), Move {
        override fun walk() {
            println("walk")
        }

        override fun play() {
            i++
            println("play:" + i)
        }
    }
    if (a is Person) {
        a.play()
    }

    if (a is Move) {
        a.walk()
    }

    //只需要“一个对象而已”，并不需要特殊超类型，那么我们可以简单地写
    val b = object {
        var x: Int = 1
        var y: Int = 2
    }
    println(b.x + b.y)

    Data.r()
    F.create()
    F.Walk.create()

}

//对象声明
object Data {
    fun r() {
    }
}

abstract class Person {
    abstract fun play()
}

interface Move {
    fun walk()
}


fun bar() {
    val x1 = f().x        // 没问题
    val x2 = publicF()  // 错误：未能解析的引用“x”
}

// 私有函数，所以其返回类型是匿名对象类型
private fun f() = object {
    val x: String = "x"
}

// 公有函数，所以其返回类型是 Any
fun publicF() = object {
    val x: String = "x"
}

class F {
    companion object Walk {
        fun create() {
            println("walk")
        }
    }
}

class F1 {
    companion object : Walk {
        override fun create(){
            println("walk")
        }
    }
}

interface Walk {
    fun create()
}



