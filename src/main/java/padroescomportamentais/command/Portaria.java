package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Portaria {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa) {
        tarefa.executar();
        this.tarefas.add(tarefa);
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}