//3.9. Leia 10 valores e informe quantos estão no intervalo de 24 a 42 (inclusive) e quantos estão fora.

fun main() {
    var dentro = 0
    var fora = 0
    var contador = 0

    while (contador < 10) {
        print("Digite um valor: ")
        val valor = readln().toInt()

        if (valor >= 24 && valor <= 42) {
            dentro++
        } else {
            fora++
        }

        contador++
    }

    println("Valores dentro do intervalo: $dentro")
    println("Valores fora do intervalo: $fora")
}