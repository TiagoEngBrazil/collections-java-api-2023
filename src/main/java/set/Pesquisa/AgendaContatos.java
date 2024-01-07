package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getName().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoatualizado = null;
        for (Contato c : contatoSet) {
            if (c.getName().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoatualizado = c;
                break;
            }
        }

        return contatoatualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Tiago Lima", 99440393);
        agendaContatos.adicionarContato("Tiago", 99998393);
        agendaContatos.adicionarContato("Jonas", 99788993);
        agendaContatos.adicionarContato("Claúdio", 976440393);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Tiago"));

        agendaContatos.atualizarNumeroContato("Tiago", 111111);
        System.out.println(agendaContatos.pesquisarPorNome("Tiago"));

        agendaContatos.exibirContatos();
    }
}
