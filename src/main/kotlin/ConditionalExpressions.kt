fun main(args: Array<String>) {
    var marks = 100
    var grade = if (marks <= 40) {
        "E"
    } else if (marks <= 50) {
        "D"
    } else if (marks <= 60) {
        "C"
    } else if (marks > 70) {
        "B"
    } else {
        "A"
    }
    println(grade)

    var bettingNumber = 3
    var bettingResult = when (bettingNumber) {
        1 -> {
            println("You won a car")
        }
        2 -> {
            println("You won a horse")
        }
        3 -> {
            println("You won 3M")
        }
        4 -> {
            println("You've lost")
        }
        else -> {
            "Enter a number between 1-4 to bet"
        }
    }
    println(bettingResult)

}
