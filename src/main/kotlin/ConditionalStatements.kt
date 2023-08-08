fun main(args: Array<String>) {
    var x = 18
    var y = 23
    if (x > y || y < 50){
        println("FALSE")
    }else{
        println("TRUE")
    }
    var marks = 100
    if (marks <= 40){
        println("E")
    }else if (marks <= 60){
        println("D")
    }else if (marks <= 70){
        println("C")
    }else if (marks > 75){
        println("A")
    }
    var bettingNumber = 3
    when(bettingNumber){
        1 -> {
            println("You won a car")
        }
        2 -> {
            println("You won a horse")
        }
        3-> {
            println("You won 3M")
        }
        4 ->{
            println("You've lost")
        }
        else -> {
            "Enter a number between 1-4 to bet"
        }
    }
    println(bettingNumber)
}