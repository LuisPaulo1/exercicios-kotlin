package fundamentos.controle

fun main(args: Array<String>) {

    val nota: Int = 9
    // Usando operador range
    when (nota) {
        9, 10 -> println("Fantástico") // nota 9 ou 10
        in 7 .. 8 -> println("Parabéns") // nota entre 7 e 8
        4, 5, 6 -> println("Tem como recuperar") // nota 4 ou 5 ou 6
        in 0 .. 3 -> {
            println("Te vejo no próximo semestre")
        }
        else -> println("Nota inválida") // equivalente ao default do switch case
    }
}