package arrays_and_lists

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun Array<String>.sortTheArray(){
    for(i in 0 until this.size){for(j in 1 until this.size){
        if(this[j-1]<this[j]){this[j] = this[j-1].also{this[j-1]=this[j]}}} //also used in swap the components
    }
}


fun Array<String>.printTheArray(){
    for(i in 0 until this.size) print(this[i]+" ")
}

fun main() {
    //Arrays
    val arrOfStates = arrayOf("Texas", "Iowa", "California", "Cincinnati")
    val mixed = arrayOf("Hello", 1, 6.7, true, arrOfStates)
    println(mixed[0])
    mixed[0] = 123.6
    println(mixed[0])
    //intArrayOf(), doubleArrayOf(), booleanArrayOf(), floatArrayOf(), charArrayOf()

    var str = "Mathanagopal"
    println(str[0].toLowerCase())

    val array2 = arrayOf("Miami", "Newark", "New York")
    val combinedArray = arrOfStates + array2
    println(combinedArray.size)
    var isEmpty: Boolean = str.isEmpty();
    println(isEmpty)
    str = ""
    isEmpty = str.isEmpty()
    println(isEmpty)
    if(combinedArray.contains("New York")){
        println("We have New York in the list")
    }
    println("Before Sort")
    println(combinedArray.printTheArray())
    combinedArray.sortTheArray();
    println("After Sort")
    println(combinedArray.printTheArray())

    //Lists
    val listOfFruits = listOf("Apple", "Orange", "Mango", "Pineapple")
    val arrayListofNames = arrayListOf("Patric", "Mike", "Eleven")
    println(arrayListofNames)
    arrayListofNames.add("Samantha")
    println(arrayListofNames)
    arrayListofNames.add(0,"Mathan")
    println(arrayListofNames)
    arrayListofNames.sort()
    println(arrayListofNames)

    println(listOfFruits.shuffled())



    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 4)
    println(shortWords)

}