package fundamentos

fun main() {
    println(soma(2, 3))
    println(soma(11))
    println(subtracao(5, 3))
}

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}