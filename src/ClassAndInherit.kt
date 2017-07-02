import sun.plugin2.os.windows.Windows
import java.awt.Window

/**
 * Created by Whyte on 2017/6/29.
 */
fun main(args: Array<String>) {
    class a {}
    a()

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

    //次构造函数和this关键字的使用
    class D(name: String) {
        constructor(name: String, age: Int) : this(name) {
            println(name)
        }

        constructor(name: String, show: Boolean) : this(name, 1)
    }

    //三个成员
    class E {

        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }

        override fun toString(): String {
            return super.toString()
        }
    }

    //继承
    open class Base(p: Int) {
        open fun v() {}
        fun nv() {}
    }

    open class E1(p: Int) : Base(p) {
        final override fun v() {
            super.v()

        }
    }

    class E2(p: Int) : E1(p) {
    }

    //覆盖属性
    open class F {
        open val x: Int get() = 2
    }

    class Bar : F() {
        override val x: Int = 0
    }

    println(H().G().f())

}



class H {
    private val b: Int = 1

    inner class G {
        fun f() = b
    }
}

interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo

class Bar2 : Foo {
    override var count: Int = 0
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }
}

interface B1 {
    fun f() {
        print("B1")
    } // 接口成员默认就是“open”的

    fun c() {
        print("c")
    }
}

class C() : A(), B, B1 {

    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}

open class Base {
    open fun f() {}
}

abstract class D : Base() {
    override abstract fun f()
}