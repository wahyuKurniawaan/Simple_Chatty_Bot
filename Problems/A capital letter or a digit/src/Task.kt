import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val input1 = scanner.next().first()
    val zero = '0'
    print(input1.isDigit() && input1 != zero || input1.isLetter() && input1.isUpperCase())
}