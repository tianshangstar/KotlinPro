package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/18.
 *
 * 在 Kotlin 中， if 是一个表达式，即它会返回一个值。 因此就不需要三元运算符（条件 ? 然后 : 否则）
 * 因为普通的 if 就能胜任这个角色。
 */
fun main(args: Array<String>) {
    val a = 1
    val b = 2
    if (a < b) {
        println("a is bigger one")
    } else {
        println("b is bigger one")
    }

    val max = if (a < b) b else a // 类似三目运算符的用法

    // if 的分支可以是代码块，最后的表达式作为该块的值

    val max1 = if (a < b) {
        println("a is bigger one")
        b
    } else {
        println("b is bigger one")
        a
    }
}