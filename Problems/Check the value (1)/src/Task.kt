import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val input = scanner.nextInt()
    print(input in 1..9)
}