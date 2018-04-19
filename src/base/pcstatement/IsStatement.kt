package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/19.
 *
 * is语句：类型判断 ----- instanceof??
 */
fun main(args: Array<String>) {
    whatsType("abc")
    whatsType(11)
}

fun whatsType(obj: Any) {

    if (obj is String) { // 直接用法
        println("is string")
        return
    }

    if (obj !is Long) {// 否定形式
        println("is not long")
        return
    }
}