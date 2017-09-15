package kokai

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
            when{
                str.isEmpty() -> -1
                predicate(str.first()) -> index
                else -> go(str.drop(1),index+1)
            }
    return go(str,0)
}

fun isCamel(str: Char): Boolean{
    return str.isUpperCase()
}

fun main(args: Array<String>){

    val lambda: (Int) -> Boolean = { i: Int -> //ラムダ式
        if(i>1){
            true
        }
        false
    }
    var num = first("aiUeo",::isCamel)//関数に関数を渡す（高階関数）
    println(num)
    (1..10).toList()
}