package collections

fun main() {

    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    for(aluno in alunos) {
        println(aluno)
    }

    for((index, aluno) in alunos.withIndex()) {
        println("$index - $aluno")
    }
}
