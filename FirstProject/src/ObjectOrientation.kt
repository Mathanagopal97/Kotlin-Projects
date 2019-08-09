class Book(val bookName:String, val authorName:String, val pubYear:Int, var isBorrowed:Boolean){
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