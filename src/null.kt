

fun checkNull() {
    var foo: String? = "Not Null"
    println(foo)
    foo = null
    println((foo ?: "nullだった").toUpperCase()) //fooがnullだった場合fooの代わりに"nullだった"に対してtoUpperCase()が実行される（エルビス演算子）


}


class myString(var str: String = "Hello "){
    fun String.addStr() { //同一クラス内からしか呼べない
        str += this
    }

    fun somes(value: String) {
        value.addStr()
    }
}

fun main(args: Array<String>) {
    val s: String? = "Hello World" //型名の後に?をつけるとnullが代入可
    println(s)
    if (s != null) { // nullを判定することで元の型のメソッドが使える
        println(s.hashCode())
    } else {
        println("null value")
    }


    val z = myString()
    z.somes("World!")
    println(z.str)

    checkNull()


}

