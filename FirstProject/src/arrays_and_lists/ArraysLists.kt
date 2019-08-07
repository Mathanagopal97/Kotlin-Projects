package arrays_and_lists

fun main() {
    //Arrays
    val arrOfStates = arrayOf("Texas", "Iowa", "California", "Cincinnati")
    val mixed = arrayOf("Hello", 1, 6.7, true, arrOfStates)
    println(mixed[0])
    mixed[0] = 123.6
    println(mixed[0])
    //intArrayOf(), doubleArrayOf(), booleanArrayOf(), floatArrayOf(), charArrayOf()

    val listOfFruits = listOf("Apple", "Orange", "Mango", "Pineapple")
    var str = "Mathanagopal"
    println(str[0].toLowerCase())
    val arrayListofNames = arrayListOf("Patric", "Mike", "Eleven")
    arrayListofNames.add("Samantha")
    val array2 = arrayOf("Miami", "Newark", "New York")
    val combinedArray = arrOfStates + array2
    println(combinedArray.size)
    var isEmpty: Boolean = str.isEmpty();
    println(isEmpty)
    str = ""
    isEmpty = str.isEmpty()
    println(isEmpty)

}