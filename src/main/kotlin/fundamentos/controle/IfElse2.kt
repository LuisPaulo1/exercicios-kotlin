package fundamentos.controle

fun main() {

    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("processando else...")
        num2
    }

    println("O maior valor é $maiorValor")

    val maiorValor2 = if (num1 > num2) num1 else num2
    println("O maior valor é $maiorValor2")

}