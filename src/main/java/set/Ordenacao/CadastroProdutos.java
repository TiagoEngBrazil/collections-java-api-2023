package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String produto, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto(produto, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

//        System.out.println(cadastroProdutos.produtoSet);

        cadastroProdutos.adicionarProduto("p1", 344556L, 4.55, 8);
        cadastroProdutos.adicionarProduto("p2", 344666L, 4.00, 8);
        cadastroProdutos.adicionarProduto("p3", 340056L, 5.55, 8);
        cadastroProdutos.adicionarProduto("p4", 340056L, 6.55, 8);

//        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}

