package constructor

class Rational constructor(n: Int, d: Int){
    val numerator: Int = n
    val denominator: Int =d
}

fun main(args: Array<String>){
    val half = Rational(1,2)
    println(half.numerator)
    println(half.denominator)
}