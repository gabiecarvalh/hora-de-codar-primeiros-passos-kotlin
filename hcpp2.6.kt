fun main() //2.6. Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.
{
    println("Insira o primeiro valor: ")
    val n1 = readln().toInt()

    println("Insira o segundo valor: ")
    val n2 = readln().toInt()

    println("Insira o terceiro valor: ")
    val n3 = readln().toInt()

    println("Insira o quarto valor: ")
    val n4 = readln().toInt()

    println("O primeiro valor: $n1")
    println("O último valor: $n4")

    if (n1 > n2 && n1 > n3 && n1 > n4)
        println("O maior valor é: $n1")
    else if (n2 > n1 && n2 > n3 && n2 > n4)
        println("O maior valor é: $n2")
    else if (n3 > n1 && n3 > n2 && n3 > n4)
        println("O maior valor é: $n3")
    else
        println("O maior valor é: $n4")
}