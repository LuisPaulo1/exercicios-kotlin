package fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())

    println("Hora do erro...")
    println(a!!.inc())
}