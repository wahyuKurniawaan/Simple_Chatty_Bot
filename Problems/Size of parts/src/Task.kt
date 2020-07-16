import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val numberOfParts = scanner.nextInt()
    var largerPart = 0
    var smallerPart = 0
    var perfectPart = 0
    repeat(numberOfParts) {
        val detector = scanner.nextInt()
        if (detector == 1) {
            largerPart++
        } else if (detector == -1) {
            smallerPart++
        } else {
            perfectPart++
        }
    }
    print("$perfectPart $largerPart $smallerPart")
}
