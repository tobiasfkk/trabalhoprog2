package Models;

import interfaces.ListaDeTarefasInterface;
import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefasList implements ListaDeTarefasInterface{

    private List<Tarefa> tarefas;

    public ListaDeTarefasList() {
        this.tarefas = new ArrayList();
    }
    
    @Override
    public Tarefa buscarTarefaModelsTitulo(String titulo) {
        for(Tarefa tarefa : this.tarefas){
            if(tarefa.getTitulo().equals(titulo)){
                return tarefa;
            }
        }
        return null;
    }

    @Override
    public Tarefa buscarTarefaModelsData(int data) {
        for(Tarefa tarefa : this.tarefas){
            if(tarefa.getData() == data){
                return tarefa;
            }
        }
        return null;
    }

    @Override
    public void addTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    @Override
    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }
    
}
