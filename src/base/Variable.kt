package base

/**
 * Created by evan01.zhang on 2018/4/18.
 */


// getter and setter
val isEmpty: Boolean
    get() = false

var name: String = "init value"
    get() = field // kotlin 提供默认属性field
    set(value) {
        field = value + "_tail"
    }

val name1
    get() = true // getter可推断类型，则可省略

private var _table: Map<String, Int>? = null
public val table: Map<String, Int>
    get() {
        if (_table == null) {
            _table = HashMap() // 类型参数已推断出
        }
        return _table ?: throw AssertionError("Set to null by another thread")
    }

fun main(args: Array<String>) {
    val a = 9 // val:不可变声明，赋值后不可重新赋值
    val a1: Int = 0 //声明Int类型
    val a2 = 1 // 自动推断类型
    //val a3 //如果没有指定类型，则不可省略初始值
    val a4: Int


    var b: Int = 0 // var:可变变量声明

    val intValue: Int = 10
    //val longValue : Long = intValue //kotlin中，不支持int->long的直接转化
    val longvalue1: Long = intValue.toLong() // 显示转化

    //用 is 语句来判断类型
    if (longvalue1 is Long) println("is long") else println("not long")

    val str = "this is a String"
    println(str)
    println("the string length is ${str.length}")
    // how to print special word
    println("abcdef\naaaa\"\"") // use \
    val price = """$9.99""" // 用3个"来转义
    println(price)
    val x = parseInt("11a")
//    x.dec()  不进行空判断，这里会编译报错
    if (x != null)
        println(x.dec())

    name = "zhangjinbao"
    println(name)
}

fun sum(a: Int, b: Int): Int { //指定Int返回类型
    return a + b
}

fun sum1(a: Int, b: Int) = a + b // 返回类型自动推断

fun sum2(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int): Unit { // Unit = java void
    println(a + b)
}

fun printSum1(a: Int, b: Int) { // 返回类型Unit可省略
    println(a + b)
}

fun parseInt(str: String): Int? { // ? 表示返回值可能为空，在试用对应返回值前需要进行空判断
    return str.toIntOrNull()
}
