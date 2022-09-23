package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"
    companion object { // objeto associado a classe
        @JvmStatic val constanteDeClasse = "Ciclano" // forma de definir membro estático sem ser por top level
    }
    fun fazer() {
        val local: Int = 7
        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco!")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}