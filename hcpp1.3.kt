fun main() //1.3. Peça ao usuário nome e idade e exiba: Olá, [NomeDoUsuario], sua idade é [idade].
{
    println ("Digite seu nome: ")
    val nome = readln()
    println ("Digite sua idade: ")
    val idade = readln()
    println ("Olá, $nome, sua idade é $idade!")
}