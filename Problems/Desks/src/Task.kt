import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()
    val desksGroup1Needed = group1 / 2 + group1 % 2
    val desksGroup2Needed = group2 / 2 + group2 % 2
    val desksGroup3Needed = group3 / 2 + group3 % 2
    print(desksGroup1Needed + desksGroup2Needed + desksGroup3Needed)
}