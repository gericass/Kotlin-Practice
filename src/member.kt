package member

class Person {
    var name: String = ""
        set(value) {
            println("${value}がセットされました")
            field = value
        }

    var age: Int = 0
    val nameLength: Int
        get(): Int {
            return this.name.length
        }
}

fun main(args: Array<String>){
    val hanako = Person()
    hanako.name = "はなこ"
    println(hanako.name)
}