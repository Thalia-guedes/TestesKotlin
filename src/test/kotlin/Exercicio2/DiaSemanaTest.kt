package Exercicio2

import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class DiaSemanaTest {
    @Test
    fun `testarDiaDaSemana() deve imprimir o dia correto para um número válido`() {
        val diaSemana = DiaSemana()

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val entradaUsuario = "4"
        System.setIn(entradaUsuario.byteInputStream())

        diaSemana.semana()

        val saidaEsperada ="Quinta"
        assertEquals(saidaEsperada, outputStream.toString())
    }

    @Test
    fun `testarDiaDaSemana() deve imprimir uma mensagem de erro para um número inválido`() {
        val diaSemana = DiaSemana()

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val entradaUsuario = "10"
        System.setIn(entradaUsuario.byteInputStream())

        diaSemana.semana()

        val saidaEsperada = ""
        assertEquals(saidaEsperada, outputStream.toString())
    }
}
