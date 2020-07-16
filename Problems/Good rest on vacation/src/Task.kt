import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val durationDays = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()
    println(foodCost * durationDays + flightCost * 2 + hotelCost * (durationDays - 1))
}