package classes

// Erro!! Kotlin: Val cannot be reassigned
// fun porReferencia(velociade: Int) {
// velocidade++
// }

fun porReferencia(carro: Carro) {
    //carro = Carro("", "") -> mudança de referência do objeto
    carro.velocidade++ // dado interno do objeto pode ser alterado
}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun main() {
    var carro1 = Carro("Ford", "Fusion")
    var carro2 = carro1
    carro2.modelo = "Edge"
    println(carro1)
    carro1 = Carro("Audi", "A4")
    porReferencia(carro1)
    porReferencia(carro2)
    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++ // b muda de referência implicitamente
    println(a === b)
    println(a)
    println(b)
}