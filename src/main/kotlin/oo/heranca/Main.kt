package oo.heranca

fun main() {
    val carro = Ferrari()
    carro.acelerar()
    println(carro)

    carro.ligarTurbo()
    carro.acelerar()
    println(carro)

    carro.frear()
    carro.frear()
    carro.desligarTurbo()
    carro.acelerar()
    println(carro)
}