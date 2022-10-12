package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import interfaces.TarefasInterface;

public class ListaDeTarefasList implements TarefasInterface{

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
    public Tarefa buscarTarefaModelsData(Date data) {
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

    @Override
    public List<Tarefa> buscarTodasTarefas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
