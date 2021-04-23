var b: String? = null/* top level variable
                      * le '?' c'est pour dire que tu peux l'init null
                      */
var a = 1
fun main() {
    //var a: integer mutable variables
    //val b: String = "a" local variable (tu peux pas changer)

    //b = "hello"

    if (b != null)
        println(b)

    /*new shit*/
    //1
    when(b){ // en gros c'est un super if, en fonction des val de ta var -> condition
        null -> println("nothing")
        else -> println("some init")
    }
    //2
    var bToprint = if (b == null) b else "some init" //en fct des val de ta main var tu créer another var
    println("that "+ bToprint)

    //1+2

    var bToprint2 = when(b){
        null -> "null"
        else -> "some init bih"
    }
    println(bToprint2)


}