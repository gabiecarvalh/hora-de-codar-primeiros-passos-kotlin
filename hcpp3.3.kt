fun main() { //3.3. Calcule e exiba a média aritmética dos números inteiros de 15 a 100 (inclusive).
    var soma = 0
    var quantidade = 0

    for (numero in 15..100) {
        soma += numero
        quantidade++
    }

    val media = soma.toDouble() / quantidade

    println("Média: $media")
}