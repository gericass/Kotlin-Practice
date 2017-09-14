package testif


fun main(args: Array<String>){
    var num = 15
    var grade =
            if(num>10) 'a'
            else 'b'
    println(grade)
    when(grade){
        'a' -> println("でかいね")
        else -> println("小さいね")
    }

    var charList: MutableList<Char> = mutableListOf('a','b','c')
    charList.add('d')
    println(charList)

    for(elem in charList){
        println(elem)
    }

}