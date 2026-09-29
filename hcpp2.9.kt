fun main() //2.9. Leia o ano de nascimento e informe se a pessoa pode votar no ano atual (sem considerar o mês).
{
    println("Insira seu ano de nascimento: ")
    val anoNascimento = readln().toInt()

    if (anoNascimento <= 2010)
        println("Você pode votar esse ano!")
    else
        println("Você ainda não pode votar...")
}