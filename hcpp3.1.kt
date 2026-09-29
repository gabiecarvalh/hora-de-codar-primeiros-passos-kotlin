fun main () //3.1. Crie uma bomba-relógio com contagem regressiva de 30 até 0 e, ao final, escreva EXPLOSÃO.
{
    var contador = 30

    while (contador >= 0) {
        println(contador)
        Thread.sleep(1000) //pausa de um segundo entre os números
        contador--
    }

    println("EXPLOSÃO!!!!")
}