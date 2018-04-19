package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/18.
 *
 *  for 可以循环遍历任何提供了迭代器的对象。即：
 *有一个成员函数或者扩展函数 iterator() ，它的返回类型
 *有一个成员函数或者扩展函数 next() ，并且
 *有一个成员函数或者扩展函数 hasNext() 返回 Boolean 。
 */
fun main(args: Array<String>) {
    val fruits = listOf<String>("banana", "apple", "orange")

    //类似foreach用法
    for (fruit in fruits) {
        println(fruit)
    }

    for (fruit: String in fruits) {
        println(fruit)
    }

    //下标用法
    for (index in fruits.indices) {
        println(fruits[index])
    }
    // 区间
    for (i in 1..10) {

    }
    // 降序区间 步长2
    for (i in 10 downTo 1 step 2) {

    }

    // 库函数 withIndex
    for ((index, value) in fruits.withIndex()) {
        println("with index $index\'s value is $value")
    }
}