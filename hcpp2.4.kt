fun main() //2.4. Leia 3 valores diferentes e mostre a soma dos 2 maiores.
{
    println("Digite o primeiro valor: ")
    val n1 = readln().toInt()

    println("Digite o segundo valor: ")
    val n2 = readln().toInt()

    println("Digite o terceiro valor: ")
    val n3 = readln().toInt()

    if (n1 < n2 && n1 < n3)
        println("A soma dos dois maiores é ${n2 + n3}")

    else if (n2 < n1 && n2 < n3)
        println("A soma dos dois maiores é ${n1 + n3}")

    else
        println("A soma dos dois maiores é ${n2 + n1}")
}