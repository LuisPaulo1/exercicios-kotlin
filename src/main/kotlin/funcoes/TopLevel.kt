package funcoes

fun main() {
    print("O menor valor é ${min1(3, 4)}")
    print("O menor valor é ${min1(5, 2)}")
}

fun min1(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun min2(a: Int, b: Int): Int = if (a < b) a else b