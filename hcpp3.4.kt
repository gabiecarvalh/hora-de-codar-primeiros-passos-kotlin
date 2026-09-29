fun main() { //3.4. Leia dois inteiros (sendo o primeiro menor que o segundo) e calcule a média desses números e de todos os inteiros entre eles.
    print("Digite o primeiro número: ")
    val primeiro = readln().toInt()

    var segundo: Int

    while (true) {
        print("Digite o segundo número: ")
        segundo = readln().toInt()

        if (segundo > primeiro) {
            break
        }

        println("Erro: o segundo número deve ser maior que o primeiro.")
    }

    var soma = 0
    var quantidade = 0

    for (numero in primeiro..segundo) {
        soma += numero
        quantidade++
    }

    val media = soma.toDouble() / quantidade

    println("Média: $media")
}