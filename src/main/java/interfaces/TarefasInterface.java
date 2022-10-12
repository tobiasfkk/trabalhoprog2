package interfaces;

import Models.Tarefa;
import java.util.Date;
import java.util.List;

 public interface TarefasInterface {
    
    Tarefa buscarTarefaModelsTitulo(String titulo);
    Tarefa buscarTarefaModelsData(Date data);
    List<Tarefa> buscarTodasTarefas(); //pra listar todas as tarefas
    void addTarefa(Tarefa tarefa);
    void removerTarefa(Tarefa tarefa);
    
}
