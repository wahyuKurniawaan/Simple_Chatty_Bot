import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val boy1 = scanner.nextInt()
    val boy2 = scanner.nextInt()
    val boy3 = scanner.nextInt()
    val ascending = boy1 >= boy2 && boy2 >= boy3
    val descending = boy1 <= boy2 && boy2 <= boy3
    print(ascending || descending)
}