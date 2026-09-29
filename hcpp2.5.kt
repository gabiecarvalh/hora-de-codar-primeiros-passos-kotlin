fun main() //2.5. Leia 6 valores, exiba todos e calcule a média aritmética.
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

    val media = (n1 + n2 + n3 + n4 + n5 + n6) / 6.0
    println("Média aritmética: $media")
}
