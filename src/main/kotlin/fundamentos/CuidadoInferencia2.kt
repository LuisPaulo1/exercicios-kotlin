package fundamentos

fun main() {

    var a = 1
    var b = 2

    //a = 2.3  // não ocorre o cast implicito
    a = 2.3.toInt() // solução

    print(a + b)

}

