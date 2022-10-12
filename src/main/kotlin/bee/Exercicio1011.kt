package bee

import java.util.Locale
import java.util.Scanner
import kotlin.math.pow

fun main() {
    val PI = 3.14159
    var entrada = Scanner(System.`in`)
    var raio = entrada.nextDouble()

    var volume = 4/3.0 * PI * raio.pow(3)

    println("VOLUME = "+"%.3f".format(Locale.US, volume))
    entrada.close()
}