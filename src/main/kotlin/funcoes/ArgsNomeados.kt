package funcoes

fun main() {
    println(relacaoDeTrabalho("João", "Maria"))
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria"))
}

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe."
}