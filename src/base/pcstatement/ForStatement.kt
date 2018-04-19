package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/18.
 */
fun main(args: Array<String>) {
    val fruits = listOf<String>("banana", "apple", "orange")

    //类似foreach用法
    for (fruit in fruits) {
        println(fruit)
    }

    //下标用法
    for (index in fruits.indices) {
        println(fruits[index])
    }
}