class Book(private val bookName:String, private val authorName:String, private val pubYear:Int, private var isBorrowed:Boolean){
    fun printInformation(){
        print("$bookName $authorName $pubYear ")
        if(isBorrowed) println("Book is borrowed")
        else println("Book is in the library")
    }
    fun bookBorrowed(){
        isBorrowed = true;
    }
    fun bookReturned(){
        isBorrowed = false;
    }
}

fun main() {
    var book = Book("Sands of Time", "Sidney Sheldon",1974,false)
    book.printInformation()
    book.bookBorrowed()
    book.printInformation()
}