

interface test {
    fun printNumber(num: Int)
}

open class Person(val name: String){
    open fun introduceMyself(){
        println("I am $name")
    }
}

class Student(name: String, val id: Long): Person(name),test { //クラスとインターフェースは同時に継承できる（使うのかは知らん）
    override fun introduceMyself() {
        super.introduceMyself() //スーパークラスでの実装も使える
        println("I am $name(id=$id)")
    }
    override fun printNumber(num: Int){
        println(num+10)
    }
}

fun main(args: Array<String>){
    val person: Person = Person("ゆたか")
    person.introduceMyself()

    val student: Student = Student("くみこ",123)
    println(student.id)
    println(student.name)
    student.introduceMyself()
    println(student.printNumber(15))

}