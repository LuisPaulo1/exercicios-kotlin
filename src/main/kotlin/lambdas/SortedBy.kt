package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    //val ordenados = nomes.reversed()
    //val ordenados = nomes.reversed().sorted()
    //val ordenados = nomes.sortedBy { it.reversed() }
    val ordenados = nomes.sortedBy { it }
    //val ordenados = nomes.sortedBy({ it })
    //val ordenados = nomes.sorted()

    println(ordenados)
}