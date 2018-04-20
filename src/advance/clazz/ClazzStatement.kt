package advance.clazz

/**
 * Created by evan01.zhang on 2018/4/20.
 *
 * 类基础
 */
/**
 * 1、类声明
 */
class Clazz1 { // kotlin中用class关键字来声明一个类

}

class Clazz2 // 声明一个空类

class Clazz3 constructor(obj1: Any, obj2: Any) { // 默认两个参数的构造函数

}

class Clazz4(obj1: Any, obj2: Any) { //如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。

}

class Clazz5(name: String) {
    // also用法： 将当前对象的this作为参数，传递给方法，即println(this)
    val firstProperty = "First property: $name".also(::println)

    // 对象初始化代码块
    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Clazz6 public /*@Inject*/ constructor(obj1: Any, obj2: Any) { //有注解或者可见性修饰符，constructor不能省略

}

class Clazz7(name: String) {
    init { // 初始化块中的代码作为主构造函数中的一部分，在所有次级构造函数之前执行
        println("namt is $name")
    }

    constructor(name: String, age: Int) : this(name) { // 次构造函数必须委托给主构造函数
        println("age is $age")
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) { //隐示委托给主构造函数
        println("sex is $sex")
    }

    fun sayHello() { //国际惯例，写个方法,没有访问修饰符，默认是public
        println("hello")
    }

    public fun sayHi() { // public作用域
        println("hi")
    }

    private fun sayBye() { // private 作用域, 在声明它的文件内可见(一个类一个class文件)
        println("bye")
    }

    protected fun sayGun() { // protected 作用域,和 private 一样 + 在子类中可见。
        println("gun")
    }

    internal fun sayFuck() {// internal 作用域, 能见到类声明的 本模块内 的任何客户端都可见其 internal 成员；
        println("fuck")
    }

    internal fun sayAll() {
        sayHello()
        sayHi()
        sayBye()
        sayGun()
        this.sayFuck()
    }
}

class Clazz8 {
    init { // 没有默认构造函数，init块依旧会在次级构造函数之前执行
        println("this is init block")
    }

    constructor(name: String) { // 没有默认构造函数，此时次级构造函数向主构造函数的委托是隐示的
        println("namt is $name")
    }

    constructor(name: String, age: Int) : this(name) { // 没有默认构造函数
        println("age is $age")
    }

}

fun main(args: Array<String>) {
    val claz7 = Clazz7("hello kitty xxxxxxxxxxxxxxxxxxxxxx", 19, "男")
//    claz7.sayHello()
//    claz7.sayFuck()
//    claz7.sayHi()
    claz7.sayAll()
//    Clazz8("hello kitty")
//    Clazz8("hello kitty", 19)
}