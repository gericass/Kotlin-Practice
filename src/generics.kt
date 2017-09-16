class gen<T>(var value: T)

fun main(args: Array<String>){
    val intContainer = gen<Int>(123)
    println(intContainer.value)
}