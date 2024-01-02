package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
//    atributos

    private final List<Livro> livroList;

    public CatalogoDeLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livreosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livreosPorAutor.add(l);
                }
            }
        }
        return livreosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else  {
            throw new RuntimeException("Não há livros nesse intervalo de anos!");
        }

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public static void main(String[] args) {

        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 2", 2002);
        catalogoDeLivros.adicionarLivro("Livro 3", "Autor 2", 2003);
        catalogoDeLivros.adicionarLivro("Livro 4", "Autor 4", 2004);

//        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 4"));
//        System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(2000, 2002));
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Livro 5"));
    }
}
