package collections

fun main() {

    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")
    map.put(60070080090, "Pedro Filho")
    println()
    for (par in map) {
        println(par)
    }
    println()
    for (nome in map.entries) {
        println(nome)
    }
    println()
    for (cpf in map.keys) {
        println(cpf)
    }
    println()
    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }
    println()
    map.size.print()
    map.get(30040050060)?.print()
    map.contains(30040050060).print()
    map.remove(30040050060)?.print()
    map.clear()
    map.isEmpty().print()
}