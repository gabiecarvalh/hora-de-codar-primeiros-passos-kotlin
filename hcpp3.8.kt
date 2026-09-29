//3.8. Imprima os 10 primeiros números inteiros maiores que 100.

fun main() {
    var numero = 101
    var contador = 0

    while (contador < 10) {
        println(numero)

        Thread.sleep(500)

        numero++
        contador++
    }
}