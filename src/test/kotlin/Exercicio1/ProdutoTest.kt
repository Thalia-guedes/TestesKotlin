import Exercicio1.Produto
import Exercicio1.encontrarProdutoDeMenorValor
import org.junit.Test
import kotlin.test.assertEquals

class Exercicio1Test {

    @Test
    fun `testarEncontrarProdutoDeMenorValor() deve retornar o produto de menor valor corretamente`() {
        val listaProdutos = listOf(
            Produto("File de frango", 20.0),
            Produto("Açucar", 15.0),
            Produto("Arroz", 25.0),
            Produto("Sorvete", 12.0)
        )

        val produtoDeMenorValorEsperado = Produto("Sorvete", 12.0)
        val produtoDeMenorValor = encontrarProdutoDeMenorValor(listaProdutos)

        assertEquals(produtoDeMenorValorEsperado, produtoDeMenorValor)
    }

    @Test
    fun `testarEncontrarProdutoDeMenorValor() deve retornar null para uma lista vazia`() {
        val listaProdutosVazia = emptyList<Produto>()

        val produtoDeMenorValor = encontrarProdutoDeMenorValor(listaProdutosVazia)

        assertEquals(null, produtoDeMenorValor)
    }

    @Test
    fun `testarEncontrarProdutoDeMenorValor() deve retornar null para uma lista nula`() {
        val listaProdutosNula: List<Produto>? = null

        val produtoDeMenorValor = listaProdutosNula?.let { encontrarProdutoDeMenorValor(it) }

        assertEquals(null, produtoDeMenorValor)
    }
}
