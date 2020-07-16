import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val inputA = scanner.nextInt()
    val inputB = scanner.nextInt()
    val inputC = scanner.nextInt()
    val inputD = scanner.nextInt()
    val inputE = scanner.nextInt()
    print(inputE in inputA..inputB || inputE in inputC..inputD)
}