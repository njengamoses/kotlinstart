import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Inbuilt functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace( "there", newValue = "King"))

    var number = 10.0
    println(sqrt(number))
    println(Math.pow(number,2.0))
    //User defined functions
    motto()
    mission()
    add()
    addition(10 , 20 )
    addition(78 , 90)
    avg(30.0, 60.0f, 90)
    println(mean(12,23.0))
    println( fullname("Moses", "Dayvon"))


}
fun motto(){
    println("Hello, this is our motto")
}
fun mission(){
    println("This is our mission")
}
fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println("Your answer is $z")
}
fun addition(x:Int, y:Int){
    var z = x + y
    println("Your answer is $z")
}
fun avg(x:Double, y:Float, z:Int){
    var average = (x + y + z)/ 3.0
    println("Your answer is $average")
}

fun mean(x:Int, y:Double):Double{
    var result = (x + y) /2.0
    return result
}
fun fullname(firstName:String, lastName:String): String{
    var name = "$firstName $lastName"
    return name
}
