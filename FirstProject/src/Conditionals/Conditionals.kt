package Conditionals

fun main(args: Array<String>) {
    var age:Int = 21
    if(age<18){
        println("You cannot register")
    }
    else{
        println("You can register")
    }

    //When Conditionals
    var mode:Int = 2
    var result = when(mode){
        1-> "Lazy mode"
        2->{
            "Mode 2" + " " +
            "Not a lazy mode"
        }
        3->"Mode 3"
        else->"Don't know that mode"
    }

    println(result)
}