package fundamentos.controle

fun main() {

    val alunos = arrayListOf("André", "Carla", "Marcos")

    for ((indice, aluno) in alunos.withIndex()) {
        print("$indice - $aluno \n")
        //print("${indice + 1} - $aluno \n")
    }

    for (aluno in alunos) {
        println(aluno)
    }
}