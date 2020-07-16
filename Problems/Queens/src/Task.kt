import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val coorX1 = scanner.nextInt()
    val coorY1 = scanner.nextInt()
    val coorX2 = scanner.nextInt()
    val coorY2 = scanner.nextInt()

    print(if (coorX2 == coorX1 || coorY2 == coorY1) {
        "YES"
    } else if (coorX1 - coorX2 == coorY1 - coorY2 || coorX1 + coorX2 == coorY1 + coorY2) {
        "YES"
    } else if (coorX1 - coorX2 == -(coorY1 - coorY2) || -(coorX1 + coorX2) == coorY1 + coorY2) {
        "YES"
    } else {
        "NO"
    })
}