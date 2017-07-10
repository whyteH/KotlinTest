/**
 * Created by Whyte on 2017/7/5.
 */
fun main(args: Array<String>) {
    fun demo(strs: Source<String>) {
        val objects: Source<Any> = strs // 这个没问题，因为 T 是一个 out
        objects.nextT()
    }
}
abstract class Source<out T> {
    abstract fun nextT(): T
}