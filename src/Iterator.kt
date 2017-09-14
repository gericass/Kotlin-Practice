package iterator

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}

fun test(num: MutableList<Int>): Int {
    return num[0]+10
}

fun arg(vararg elems: Int): Int{
    var sum: Int = 0
    for(i in elems){
        sum += i
    }
    return sum
}

fun main(args: Array<String>){
    var num = mutableListOf(1,2,3,4,5)
    println(test(num))
    var res = arg(*intArrayOf(1,2,3,4,5))
    println(res)
}