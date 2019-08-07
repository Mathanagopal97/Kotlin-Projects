fun main() {
    var sum=0
    for(i in 1..500)
        sum+=i;
    println(sum)

    val list = listOf<String>("Java", "Kotlin", "C#")
   printWithoutIndex@ for(elements in list)
        print("$elements ")
    println()
   printWithIndex@ for((index, value) in list.withIndex())
        println("The index is - $index and the value is - $value")
}