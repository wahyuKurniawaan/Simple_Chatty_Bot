import java.util.*

// write your code here
fun Int.isRightEquation(a: Int, b: Int): Boolean {
    return a * b == this
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(c.isRightEquation(a, b))
}