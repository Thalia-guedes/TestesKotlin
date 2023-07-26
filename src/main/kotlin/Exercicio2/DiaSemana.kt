package Exercicio2

class DiaSemana {

    fun semana(){
        //println("Digite um numero para descobrir o dia da semana!")
        val numero = readln().toInt()

        when(numero){
            1 -> println("\"Segunda\"")
            2 -> println("\"Terça\"")
            3 -> println("\"Quarta\"")
            4 -> println("Quinta")
            5 -> println("\"Sexta\"")
            6 -> println("\"Sabado\"")
            7 -> println("\"Domingo\"")
        }

    }
}

fun main() {
    val executar = DiaSemana()
    executar.semana()
}