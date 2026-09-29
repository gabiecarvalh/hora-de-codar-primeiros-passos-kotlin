fun main() { //3.6. Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.  
    var soma = 0.0
    var contador = 0

    while (contador < 6) {
        print("Digite uma nota de 0 a 10: ")
        val nota = readln().toDouble()

        if (nota >= 0 && nota <= 10) {
            soma += nota
            contador++
        } else {
            println("Nota inválida. Digite uma nota entre 0 e 10.")
        }
    }

    val media = soma / 6

    println("Média: $media")
}