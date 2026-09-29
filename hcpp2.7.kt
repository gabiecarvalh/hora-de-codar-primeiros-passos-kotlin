fun main() //2.7. Leia 6 números. Some apenas os valores menores que 72. Exiba a some e todos os valores informados.
{
    println("Insira o primeiro valor: ")
    val n1 = readln().toInt()

    println("Insira o segundo valor: ")
    val n2 = readln().toInt()

    println("Insira o terceiro valor: ")
    val n3 = readln().toInt()

    println("Insira o quarto valor: ")
    val n4 = readln().toInt()

    println("Insira o quinto valor: ")
    val n5 = readln().toInt()

    println("Insira o sexto valor: ")
    val n6 = readln().toInt()

    println("$n1, $n2, $n3, $n4, $n5, $n6")

    var soma = 0

    if (n1 < 72)
        soma = soma + n1

    if (n2 < 72)
        soma = soma + n2

    if (n3 < 72)
        soma = soma + n3

    if (n4 < 72)
        soma = soma + n4

    if (n5 < 72)
        soma = soma + n5

    if (n6 < 72)
        soma = soma + n6

    println("Soma dos valores menores que 72: $soma")
}