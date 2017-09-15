class gen<T>(var value: T)

fun <T> genfunc(value: T): String {
    return value.toString()
}

fun main(args: Array<String>){
    val intContainer = gen<Int>(123)
    println(intContainer.value)

    println(genfunc("hahaha"))
}