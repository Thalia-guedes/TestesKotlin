package Exercicio1

data class Produto(val nome: String, val preco: Double)

fun encontrarProdutoDeMenorValor(produtos: List<Produto>): Produto? {
    if (produtos.isEmpty()) {
        return null
    }

    var produtoMenorValor = produtos[0]
    for (produto in produtos) {
        if (produto.preco < produtoMenorValor.preco) {
            produtoMenorValor = produto
        }
    }

    return produtoMenorValor

}

fun main() {

    fun encontrarProdutoDeMenorValor(produtos: List<Produto>): Produto? {
        return produtos.minByOrNull { it.preco }
    }


    val listaProdutos = listOf(
        Produto("File de frango", 20.0),
        Produto("Açucar ", 15.0),
        Produto("Arroz ", 25.0),
        Produto("Soverte ", 12.0)
    )

    val produtoDeMenorValor = encontrarProdutoDeMenorValor(listaProdutos)
    if (produtoDeMenorValor != null) {
        println("O produto de menor valor é: ${produtoDeMenorValor.nome} menor Preço: ${produtoDeMenorValor.preco}")
    } else {
        println("A lista de produtos está vazia.")
    }

}