//3.7. Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.

fun main() {
    print("Digite um número maior que 0: ")
    var n = readln().toInt()

    while (n <= 0) {
        println("Valor inválido. Digite novamente.")
        print("Digite um número maior que 0: ")
        n = readln().toInt()
    }

    var numero = 1

    while (numero <= n) {
        println(numero)
        Thread.sleep(500)
        numero++
    }
}