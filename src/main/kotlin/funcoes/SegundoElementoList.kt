package funcoes

fun main() {
    val list = listOf("João", "Maria", "Pedro")
    print(list.secondOrNull())
}

//fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun <E> List<E>.secondOrNull(): E? {
    return if(this.size >= 2) this.get(1) else null
}