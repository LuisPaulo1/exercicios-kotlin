package fundamentos

fun main() {
    val opcional : String? = null
    val obrigatorio : String = opcional ?: "Valor padrão" // se opcional for nulo é utilizado o valor padrão senão é usado o opcional
    println(obrigatorio)
}