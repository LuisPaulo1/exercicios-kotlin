package fundamentos.operadores

fun main() {
    val valor = "abc"
    //val valor: Any = 1

    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Não é uma String")
    }
}