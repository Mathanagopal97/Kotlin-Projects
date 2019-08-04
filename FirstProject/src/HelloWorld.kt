fun main()
{
    println("Hello World")

    var changable = "This can be changed"
    val unchangable = "This cannot be changed"

    println("$changable and $unchangable")


    var b: Byte = 127
    var s: Short = 1000
    var i:Int = 12
    var d:Double = 34.6
    var bool:Boolean = true
    var f:Float = 56.7f
    var l:Long = 1234213432423421424

    //toDouble() toLong() toInt() toShort()

    //Nullable String, Int, Double, Float

    var str: String? = null
    println(str?.length)
    str = "Hello there"
    println(str?.length)

    str=null
    var len: Int? = str?.length ?: 0 //Elvis Operator - '?:'

    print(len)


}
