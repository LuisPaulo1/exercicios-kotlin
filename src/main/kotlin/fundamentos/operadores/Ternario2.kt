package fundamentos.operadores

fun obterResultado1(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"

fun obterResultado2(nota : Double) = if(nota >= 7.0) "Passou" else 10

fun obterResultado3(nota : Double) : String {
    return if(nota >= 7.0) "Passou" else "Reprovou"
}

fun main(args: Array<String>) {
    println(obterResultado1(8.3))
    println(obterResultado2(6.5))
    println(obterResultado3(7.5))
}