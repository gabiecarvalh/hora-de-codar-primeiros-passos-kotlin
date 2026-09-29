fun main() //2.2. Leia um valor e diga se ele é positivo, negativo ou zero.
{
    println("Digite um valor: ")
    val n1 = readln().toInt()

    if (n1 > 0)
        println("O valor é positivo")
    else if(n1 < 0)
        println("O valor é negativo")
    else
        println("O valor é zero")
}