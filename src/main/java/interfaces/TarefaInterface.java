package interfaces;

import Models.Tarefa;
import java.util.Date;
import java.util.List;

 public interface TarefaInterface {
    
    public void gravar(Tarefa tarefa);
    public Tarefa buscar(Date data);
    public List<Tarefa> buscarTodasTarefas();
    
//    Tarefa gravar(String titulo);
//    void addTarefa(Tarefa tarefa);
//    void removerTarefa(Tarefa tarefa);
    
}
