package base.pcstatement

/**
 * Created by evan01.zhang on 2018/4/19.
 */
fun main(args: Array<String>) {

    between(5)
    println("-----------------------------------")
    notBetween(11)
    println("-----------------------------------")
    intera()
    println("-----------------------------------")
    interaWithStep()
    println("-----------------------------------")
    interaDownTo()

}

fun between(i: Int) {
    if (i in 1..10) {
        println("$i in 1-10")
    }
}

fun notBetween(i: Int) {
    if (i !in 1..10) {
        println("$i not in 1-10")
    }
}

fun intera() { //迭代
    for (i in 1..10) {
        println(i)
    }
}

fun interaWithStep() { //迭代 控制步长
    for (i in 1..10 step 2) {
        println(i)
    }
}

fun interaDownTo() {
    for (i in 10 downTo 1 step 3) {
        println(i)
    }
}

