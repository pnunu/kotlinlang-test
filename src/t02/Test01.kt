package t02

/**
 * @Author pnunu@git
 * @Date 2018/2/17 13:45
 */

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    print(max(1, 2))
}
