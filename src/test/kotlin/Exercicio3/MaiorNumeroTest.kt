import Exercicio3.MaiorNumero
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MaiorNumeroTest {
    @Test
    fun `testarEncontrarMaiorNumero() deve imprimir o maior número corretamente`() {
        println("Digite cinco números: ")
        val maiorNumero = MaiorNumero()

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val entradaUsuario = "5\n2\n8\n1\n3\n" // Números digitados: 5, 2, 8, 1, 3
        System.setIn(entradaUsuario.byteInputStream())

        val resultadoEsperado = 8
        val resultado = maiorNumero.encontrarMaiorNumero()

        assertEquals(resultadoEsperado, resultado)
        val saidaEsperada = "O maior número é 8\n"
        assertEquals(saidaEsperada, outputStream.toString())
    }

    @Test
    fun `testarEncontrarMaiorNumero() deve lançar exceção para lista de números vazia`() {
        val maiorNumero = MaiorNumero()

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val entradaUsuario = "" // Nenhum número digitado
        System.setIn(entradaUsuario.byteInputStream())

        assertFailsWith<IllegalArgumentException> {
            maiorNumero.encontrarMaiorNumero()
        }

        val saidaEsperada = ""
        assertEquals(saidaEsperada, outputStream.toString())
    }
}
