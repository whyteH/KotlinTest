/**
 * Created by Whyte on 2017/6/29.
 */
fun main(args: Array<String>) {
    class a {}

    //主构造函数
    class P constructor(name: String) {

    }

    //可以去掉constructor关键字
    class P1(name: String) {

    }

    // 如果构造函数有注解或可见性修饰符，constructor关键字则是必需的，并且这些修饰符在它前面
    class P2 private constructor(name: String) {

    }

    //在init中初始化代码
    class C(name: String) {
        init {
            println("name is :$name")
        }
    }

    C("1")

    //主构造函数中可以初始化构造参数
    class C1(name: String, age: Int = 1) {
        val u = name.toUpperCase()
        val a = age
    }

    val c = C1("d")
    println(c.u + "---" + c.a)

    //声明属性以及主构造函数初始化属性，简洁的语法
    class C2(val name: String, var age: Int) {
    }

    class D(name: String) {
        constructor(name: String, age: Int) : this(name) {
            println(name)
        }
    }
}