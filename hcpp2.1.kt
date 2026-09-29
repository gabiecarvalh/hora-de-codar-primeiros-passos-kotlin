fun main() //2.1. Leia dois números e mostre o maior deles.
{
    println("Digite o primeiro número: ")
    val n1 = readln()!!.toInt()

    println("Digite o segundo número: ")
    val n2 = readln()!!.toInt()

    if (n1 > n2)
        println ("O maior número é: $n1 ")
    else
        println ("O maior número é: $n2")
}