package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}
fun somar(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    val resultado1 = executarComLog("somar") {
        somar(4, 5)
    }
    println(resultado1)

    val resultado2 = executarComLog("somar", {somar(7, 5) })
    //println(resultado2)
}