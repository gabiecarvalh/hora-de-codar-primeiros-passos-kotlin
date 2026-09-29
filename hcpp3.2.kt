fun main() //3.2. Leia dois valores. Enquanto o segundo valor for menor ou igual a zero, peça novamente esse mesmo valor.
// Ao final, mostre a divisão do primeiro pelo segundo.
{
    println("Insira o primeiro valor: ")
    var n1 = readln().toDouble()

    println("Insira o segundo valor: ")
    var n2 = readln().toDouble()

    while(n2 <= 0){
        println("Valor inválido. Insira novamente.")
    n2 = readln().toDouble()}

    val resultado = n1 / n2

    println("Resultado: $resultado")
}