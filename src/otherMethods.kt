class MyInt(val value: Int) {
    operator fun times(that: MyInt): MyInt = // 演算子オーバーロード "*"が入力されると呼び出される
            MyInt(value * that.value)

    operator fun invoke(): Char = 'A'
}

fun main(args: Array<String>){
    val product = MyInt(3) * MyInt(5)
    println(product.value)

    val myInt = MyInt(5)
    println(myInt())//invoke()メソッドはこの様に呼び出せる
}