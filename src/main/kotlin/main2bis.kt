/*
*unit == void
*
*
 */

fun getHey(){// or : Unit
    println("hey")
}
fun getName() :String{
    return "hééey"
}
fun getNameAlter() = "hey" //same than up

fun saySomeShit(a:String){
    println("hey "+a)
    print("what's up $a")
}
fun main(){
    println(getNameAlter())
    getHey()
    var name = "Shaïna"

    saySomeShit(name)
}