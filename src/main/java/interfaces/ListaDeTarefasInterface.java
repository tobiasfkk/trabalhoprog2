package interfaces;

import Models.Tarefa;
import java.util.List;

public interface ListaDeTarefasInterface {
    
    Tarefa buscarTarefaModelsTitulo(String titulo);
    Tarefa buscarTarefaModelsData(int data);
    //List<ModelsTarefa> getTodasTarefas(); //pra listar todas as tarefas
    void addTarefa(Tarefa tarefa);
    void removerTarefa(Tarefa tarefa);
    
}
