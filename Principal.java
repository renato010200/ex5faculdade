package principal;

import GerenciadorProdutos.GerenciadorProdutos;
import produto.Produto;

public class Principal {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        Produto produto1 = new Produto(1, "Tablet", 27000);
        Produto produto2 = new Produto(2, "Computador", 1500);
        Produto produto3 = new Produto(3, "Celular", 3000);
        Produto produto4 = new Produto(3, "Telefone", 4000);


        gerenciador.adicionarProduto(produto1);
        gerenciador.adicionarProduto(produto2);
        gerenciador.adicionarProduto(produto3);
        gerenciador.adicionarProduto(produto4);


        gerenciador.listarProdutos();


        gerenciador.removerProduto(2);


        gerenciador.listarProdutos();
    }
}