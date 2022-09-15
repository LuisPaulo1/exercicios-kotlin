package funcoes

class Operacoes {
    fun somar1(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int {
    return funcao(a, b)
}

fun main() {
    println(calc(2, 3, Operacoes()::somar1)) // função da classe
    println(calc(6, 9, ::somar2)) // função top level
}
