package fundamentos.operadores

import java.util.*

fun main() {
    souEsperto("Ola")
    souEsperto(9)
    souEsperto2("Opa")
    souEsperto2(7)
    souEsperto2(true)
}

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    when(x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida!")
    }
}