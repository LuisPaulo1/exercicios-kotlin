package funcoes

fun main() {
    imprimeMaior1(3, 2).run { 4 > 5 }.run { println("Resultado = $this") }
    imprimeMaior2(2, 0)
    imprimeMaior3(11, 9)
    imprimeMaior4(6, 7)
    imprimeMaior5(1, 5)
}

fun imprimeMaior1(a: Int, b: Int) {
    println(a.coerceAtLeast(b))
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(a.coerceAtLeast(b))
}

fun imprimeMaior3(a: Int, b: Int): Unit {
    println(a.coerceAtLeast(b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit {
    println(a.coerceAtLeast(b))
    return Unit
}

fun imprimeMaior5(a: Int, b: Int) {
    println(a.coerceAtLeast(b))
    return Unit
}
