fun main() { //3.5. Leia 2 notas de um aluno, calcule a média final e considere aprovação com nota 9,5.
    // Em seguida, pergunte: Calcular a média de outro aluno?  (S/N). Se a resposta for S, repita; caso contrário, encerre e mostre a quantidade de alunos aprovados.
    var aprovados = 0
    var resposta = "S"

    while (resposta == "S") {
        print("Digite a primeira nota: ")
        val nota1 = readln().toDouble()

        print("Digite a segunda nota: ")
        val nota2 = readln().toDouble()

        val media = (nota1 + nota2) / 2

        println("Média final: $media")

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovados++
        } else {
            println("Aluno reprovado!")
        }

        print("Calcular a média de outro aluno? (S/N): ")
        resposta = readln().uppercase()
    }

    println("Quantidade de alunos aprovados: $aprovados")
}