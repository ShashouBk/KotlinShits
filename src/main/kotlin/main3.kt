import sun.misc.MetaIndex

fun main() {
    val arrayOne = arrayOf("a","b","c")
    var i: Int = 0

    while (i<arrayOne.size){
        print(arrayOne.get(i))
        i++
    }
    println()
    //or
    for (arrayOne in arrayOne){
        println(arrayOne)
    }
    //or
    arrayOne.forEach{it;String
        println(it)
    }

    arrayOne.forEach{arrayOne ->
        println(arrayOne)
    }
}