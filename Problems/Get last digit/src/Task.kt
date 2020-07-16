import java.util.*

// write your code here
fun getLastDigit(number: Int): Int {
    var value = number % 10
    if (value < 0) value *= -1
    return value
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}