fun displayMax(a: Int, b: Int) : Boolean = a > b

fun displayMin(a: Int, b: Int) : Boolean {
    return a < b
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        println(character)
    }
}

val input = "y"
val output = when (input) {
    "y","yes","yah" -> "Yes, you are right there"
    "n","no","nah" -> "No, that is not correct"
    else -> "Get lost from here"
}

fun getWeather(degree: Int): String {
    return when {
        degree > 50 -> "To hot to handle"
        else -> "It's ok, can be managed"
    }
}

// Iterating over a list of any type element
//val list = listOf("s","b",1,2.0,'c')
//for (s:Any in list) {
//    println(s)

// Ierating over a map

//val map = mapOf("Subham" to "IPsoft", "Sumit" to "TCS")
//
//for ((key,value) in map) {
//    println("$key = $value")
//}

// Iterating over indexed list
//val list = listOf("a","b","c")
//for((index) in list.withIndex()) {
//    println(index)
//}

fun main() {
    //println(listOf('a','b','c').joinToString(separator = "", prefix = "(", postfix = ")"))
    //println(mutableListOf('a','b','c'))
    //print(getWeather(5))
    for (ch in "abc"){
        print(ch + 1)
    }
}