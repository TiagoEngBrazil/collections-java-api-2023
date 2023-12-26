package main.java.list.OperacoesBasicas;

public class Tarefa {

    private String tarefa;

    public Tarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescicao() {
        return tarefa;
    }

    @Override
    public String toString() {
        return tarefa;
    }
}
