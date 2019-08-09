fun ArrayList<String>.printNames(){
    for(i in 0 until this.size)
    if(this[i].contains('e'))
        println(this[i])
}

fun main() {
    var favBooks = arrayListOf<String>("If tomorrow comes", "Sands of time", "Three mistakes of my life", "Gadsby", "La Dispariton")
    favBooks.printNames()
}