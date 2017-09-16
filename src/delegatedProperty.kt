import kotlin.reflect.KProperty

class MyClass {
    var _str: String? = null
    var str: String? by object { //ゲッターとセッターの処理を変更する
        operator fun getValue(thisRef: MyClass,
                              property: KProperty<*>): String? {
            println("${property.name}がgetされました")
            return _str
        }

        operator fun setValue(thisRef: MyClass,
                              property: KProperty<*>,value: String?) {
            println("${property.name}に${value}がsetされました")
            _str = value
        }
    }
}

fun main(args: Array<String>){
    val myClass = MyClass()
    println(myClass.str)
    myClass.str = "ラーメン"
    println(myClass.str)
}