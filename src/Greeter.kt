interface Greeter {
    fun sayHello(target: String)
    fun sayHello()
}

open class JapaneseGreeter: Greeter {
    override fun sayHello() {
        println("こんにちは、匿名さん！")
    }
    override fun sayHello(target: String) {
        println("こんにちは、${target}さん！")
    }
}

class JapaneseGreeterWithRecordsing : JapaneseGreeter() {
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        super.sayHello(target)
    }

}

fun main(args: Array<String>){
    val greeter = JapaneseGreeter()
    greeter.sayHello()
    greeter.sayHello("たろう")
}