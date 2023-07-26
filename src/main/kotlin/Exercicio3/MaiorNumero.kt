package Exercicio3

class MaiorNumero {
    fun encontrarMaiorNumero(): Int {
        println("Digite cinco números: ")
        val numeros = mutableListOf<Int>()

        for (i in 1..5) {
            numeros.add(readln()?.toIntOrNull() ?: 0)
        }

        if (numeros.isEmpty()) {
            throw IllegalArgumentException("Nenhum número foi digitado.")
        }

        val maiorNumero = numeros.maxOrNull()!!

        println("O maior número é $maiorNumero")
        return maiorNumero
    }
}

fun main() {
    val executar = MaiorNumero()
    executar.encontrarMaiorNumero()
}
