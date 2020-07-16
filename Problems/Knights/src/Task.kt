import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val coordinateX1 = scanner.nextInt()
    val coordinateY1 = scanner.nextInt()
    val coordinateX2 = scanner.nextInt()
    val coordinateY2 = scanner.nextInt()

    print(if (coordinateX2 == coordinateX1 - 1 && coordinateY2 == coordinateY1 - 2) {
        "YES"
    } else if (coordinateX2 == coordinateX1 - 2 && coordinateY2 == coordinateY1 - 1) {
        "YES"
    } else if (coordinateX2 == coordinateX1 - 1 && coordinateY2 == coordinateY1 + 2) {
        "YES"
    } else if (coordinateX2 == coordinateX1 - 2 && coordinateY2 == coordinateY1 + 1) {
        "YES"
    } else if (coordinateX2 == coordinateX1 + 1 && coordinateY2 == coordinateY1 + 2) {
        "YES"
    } else if (coordinateX2 == coordinateX1 + 2 && coordinateY2 == coordinateY1 + 1) {
        "YES"
    } else if (coordinateX2 == coordinateX1 + 1 && coordinateY2 == coordinateY1 - 2) {
        "YES"
    } else if (coordinateX2 == coordinateX1 + 2 && coordinateY2 == coordinateY1 - 1) {
        "YES"
    } else {
        "NO"
    })
}
