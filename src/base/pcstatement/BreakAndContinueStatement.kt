package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/18.
 */
fun main(args: Array<String>) {
//    forJumpAndBreak()
//    println("-----------------------")
//    forJumpAndContinue()

//    foo()
//    foo1()
//    foo4()
    println(returnNum())
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // 非局部直接返回到 foo() 的调用者
        println(it)
    }
    println("this point is unreachable")
}

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach label1@ {
        if (it == 3) return@label1 // 局部label返回到label后，即该表达式的调用者位置
        println(it)
    }
    println("this point is unreachable")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // 隐示标签。。。标签与函数同名
        println(it)
    }
    println("this point is unreachable")
}

// 匿名函数
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3)
            return // 局部返回到匿名函数的调用者，即forEach，类似continue
        println(value)
    })
    println("this point is unreachable")
}

fun foo4() {
    run loop@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // 从传入 run 的 lambda 表达式非局部返回
            println(it)
        }
    }
    print(" done with nested loop")
}

fun returnNum(): Int {
    label1@ for (i in 1..3) {
        label2@ for (j in 1..3) {
            if (i == 2) {
                return@label1 2
            }
            if (j == 3) {
                return@label2 3
            }
            println("i is $i j is $j")
        }
    }
    return 0
}

/**
 * result :
 * i is 1 j is 1
 * i is 1 j is 2
 */
fun forJumpAndBreak() {
    label1@ for (i in 1..3) {
        label2@ for (j in 1..3) {
            if (i == 2) {
                break@label1
            }
            if (j == 3) {
                break@label2
            }
            println("i is $i j is $j")
        }
    }
}


/**
 * result :
 * i is 1 j is 1
 * i is 1 j is 2
 * i is 3 j is 1
 * i is 3 j is 2
 */
fun forJumpAndContinue() {
    label1@ for (i in 1..3) {
        label2@ for (j in 1..3) {
            if (i == 2) {
                continue@label1
            }
            if (j == 3) {
                continue@label2
            }
            println("i is $i j is $j")
        }
    }
}