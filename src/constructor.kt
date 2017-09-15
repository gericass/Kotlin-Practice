package constructor

class Rational(val n: Int,val d: Int){ //"constructor"は省略可
    constructor(n: Int) : this(n,1)//セカンダリコンストラクタnを受け取りdを1にセット
    val numerator: Int = n
    val denominator: Int =d
}

class extendedProparty(var str: String) {
    fun addString() {
        this.str += " World!"
    }

    val extendedGetter: String
        get() = this.str+" is Mine"

}

fun String.countWords(): Int { //拡張関数 定義した関数をStringメソッドの様に扱える
    return this.split("""\s""".toRegex()).size
}

fun main(args: Array<String>){
    val half = Rational(1,2)
    println(half.numerator)
    println(half.denominator)

    var count = "Hello my world!".countWords()
    println(count)

    var ext = extendedProparty("Hello")
    ext.addString()
    println(ext.extendedGetter)

}