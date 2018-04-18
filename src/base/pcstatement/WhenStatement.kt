package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/18.
 *
 * when 取代了类 C 语言的 switch 操作符。
 */
fun main(args: Array<String>) {
    println(what(1))
    println(what(3))
    println(what(15L))
    println(what("hello"))
    println(what(22))
    println(what(111))
    println(what("str"))
}

fun what(obj: Any): String { // any表示接收任意类型 : String 指定返回String
    when (obj) {
        1 -> return "the obj is 1"
        2, 3 -> return "the obj is 2 or 3" //多分支用相同方式处理，用逗号分隔
        getLongValue() -> return "the obj is long value : 15" //任意表达式
        getString() -> return "world"//任意表达式
        in 20..30 -> return "the obj is between 20 and 30"//任意表达式
        !is String -> return "obj is not String"//任意表达式
        else -> return "不知道是啥"
    }
}

fun what1(obj: Any): String =
        when (obj) {
            1 -> "the obj is 1"
            2, 3 -> "the obj is 2 or 3"
            getLongValue() -> "the obj is long value : 15"
            getString() -> "world"
            in 20..30 -> "the obj is between 20 and 30"
            !is String -> "obj is not String"
            else -> "不知道是啥"
        }

fun getLongValue(): Long = 15

fun getString() = "hello"