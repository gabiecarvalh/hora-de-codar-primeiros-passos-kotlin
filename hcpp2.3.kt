fun main() //2.3. Leia 3 valores diferentes e mostre o maior.
{
    println("Digite o primeiro valor: ")
    val n1 = readln()

    println("Digite o segundo valor: ")
    val n2 = readln()

    println("Digite o terceiro valor: ")
    val n3 = readln()

    if(n1 > n2 && n1 > n3)
        println("O maior valor é $n1")
    else if(n2 > n3 && n2 > n1)
        println("O maior valor é $n2")
    else
        println("O maior valor é $n3")
}