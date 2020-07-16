import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val begin = scanner.nextInt()
    val end = scanner.nextInt()
    var sum: Long = 1L
    for (i in begin until end) {
        sum *= i
    }
    print(sum)
}