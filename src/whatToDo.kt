fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String  = when {
    goWalk(mood,weather) -> "go for a walk"
    stayInBed(mood,weather,temperature) -> "stay in bed"
    goSwim(temperature) -> "go swimming"
    else -> "Stay home and read"
}

fun goWalk(mood:String,weather: String) = mood == "happy" && weather == "sunny"
fun stayInBed(mood: String,weather: String,temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun goSwim(temperature: Int) = temperature > 35

//val collection = listOf("papaya","pen","red","blue","yellow")
//println(collection.filter { it[0] == 'r' })

// Create a filter that gets all the curries and sorts them by string length.
//spices.filter { it.contains("curry") }.sortedBy { it.length }

// Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
//spices.filter { it[0] == 'c' && it.endsWith('e') }
//spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' }

//Take the first three elements of the list and return the ones that start with 'c'.
//spices.take(3).filter { it[0] == 'c' }

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println()
}