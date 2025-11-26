
// Write a program grading score using conditional statement (IF ELSE)

fun main() {
    var marks = 65

    if (marks > 100){
        println("Score can not be exceed than 100")
    }else if (marks >= 80 && marks <= 100){
        println("A+")
    }else if (marks <= 79 && marks >= 60){
        println("A")
    }else if (marks <= 59 && marks >= 50){
        println("B")
    }else if (marks <= 49 && marks >= 0){
        println("F")
    }else if(marks < 0){
        println("Score can not be negative")
    }else {
        println("Score is INVALID!")
    }
}