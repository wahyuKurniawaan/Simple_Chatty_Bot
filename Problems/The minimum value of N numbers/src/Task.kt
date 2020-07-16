import java.lang.Integer.MAX_VALUE
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var check: Int = MAX_VALUE
    repeat(number) {
        val number2 = scanner.nextInt()
        if (number2 < check) check = number2
    }
    print(check)
}