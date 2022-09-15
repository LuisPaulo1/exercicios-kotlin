package funcoes

fun main() {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, x = 0)) {
        print("$n ")
    }
}
fun ordenar(vararg numeros: Int, x: Int): IntArray {
    return numeros.sortedArray()
}