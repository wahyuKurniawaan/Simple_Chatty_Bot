import java.util.*

fun main(args: Array<String>) {
    val d0 = 1.0
    val f0 = 1f
    val l0 = 30L

    val d: Double = 1.0 % 10f         //1
    val f: Float = d0.toLong() + 1.0  //2
    val l: Long = f0.toInt() + 4      //3
    val n: Int = l0.toByte() + 2      //4
}