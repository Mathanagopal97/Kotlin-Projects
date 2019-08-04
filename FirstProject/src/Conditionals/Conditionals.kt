package Conditionals

import java.util.*

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


    //Conditionals Exercise
    val random:Int = Random().nextInt(50)+1;

     result = when(random){
        in 1..10 -> "$random is Between 1 and 10"
        in 11..20 -> "$random is Between 11 and 20"
        in 20..30 -> "$random is Between 20 and 30"
        in 30..40 -> "$random is Between 30 and 40"
        in 40..50 -> "$random is Between 40 and 50"
        else -> "$random is ND"
    }
    println(result)
}