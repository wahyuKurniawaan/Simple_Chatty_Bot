import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val peanuts = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()
    val weekdayParty = peanuts >= 10 && peanuts <= 20 && isWeekend == false
    val weekendParty = peanuts >= 15 && peanuts <= 25 && isWeekend == true
    print(weekdayParty || weekendParty)
}