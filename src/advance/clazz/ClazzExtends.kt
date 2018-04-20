package advance.clazz

/**
 * Created by evan01.zhang on 2018/4/20.
 */

class NotOpenClass// kotlin中，所有的类都默认隐示继承了Any，类似java的Object

open class Base // kotlin中，open关键字与java中final关键字相反，默认在kotlin中，所有类都是不可以继承的

class Child : Base { // 如果父类没有主构造函数，无需初始化
    constructor() {
    }

    constructor(any: Any) : super() { // 当然，也可以酱紫

    }
}

open class Base1(any: Int)

class Child1 : Base1 {
    constructor() : super(1) { // 如果父类有主构造函数，但是子类没有默认构造函数，那么每个次级构造函数，必须super初始化鸡肋
    }
}


open class Animal(name: String) : Base() { //如果子类有主构造函数，其父类必须就地初始化
    open val size = 999

    init {
        println("my name is : $name")
        println("this is init block      ")
    }

    protected fun run() {
        println("I'm runnning -----------------")
    }

    fun printSize() {
        println("size is : $size")
    }

    internal open fun printInfo() {
    }

}

class Dog(weight: Int) : Animal("dog") { // 继承并默认初始化
    override val size = 111 // 属性重写
    val weight = weight
    final override fun printInfo() { // 方法重写,override方法默认是open的，加上final修饰，禁止在子类中重写
        println("my weight is : $weight")
    }

    constructor(weight: Int, height: Int) : this(weight) { // 多构造函数
        println("my height is : $height")
    }
}

fun main(args: Array<String>) {
//    val animal = Animal("animal")
//    animal.printInfo()
//    animal.printSize()
//    println("************************************")
//    val dog = Dog(15)
//    dog.printInfo()
//    dog.printSize()
//    println("************************************")
//    val dog1 = Dog(15, 999)
//    dog1.printInfo()
//    dog1.printSize()

    "myName".also { println(it) }
}
