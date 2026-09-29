fun main() /* 2.8. Leia 4 números, aceitando apenas valores maiores que 0 e menores que 10. Calcule a média e:
- se média > 5, exiba "Você passou no teste";
- caso contrário, exiba "Tente novamente". */
{
    println("Insira o primeiro valor: ")
    var n1 = readln().toInt()
    while (n1 < 0 || n1 > 10){
        println("Valor inválido. Insira novamente:")
    n1 = readln().toInt()}

    println("Insira o segundo valor: ")
    var n2 = readln().toInt()
    while (n2 < 0 || n2 > 10){
        println("Valor inválido. Insira novamente:")
        n2 = readln().toInt()}

    println("Insira o terceiro valor: ")
    var n3 = readln().toInt()
    while (n3 < 0 || n3 > 10){
        println("Valor inválido. Insira novamente:")
        n3 = readln().toInt()}

    println("Insira o quarto valor: ")
    var n4 = readln().toInt()
    while (n4 < 0 || n4 > 10){
        println("Valor inválido. Insira novamente:")
        n4 = readln().toInt()}

    val media = (n1 + n2 + n3 + n4 ) / 4.0

    println ("Média: $media")

    if (media > 5){
        println("Você passou no teste!")}
    else{
        println("Tente novamente")}
}