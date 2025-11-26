// Write a program to make calculator input system using when statement

fun main() {
    val a: Double = 1.5
    val b: Double = 4.0
    val op = '/'

    val result = when (op){
        '+' -> a + b
        '-' -> a - b
        '/' -> if (b!=0.0) a / b else println("Cannot divide by 0")
        '%' -> if (b!=0.0) a % b else println("Cannot divide by 0")
        '*' -> a * b
        else -> "Invalid"
    }
    println(result)
}