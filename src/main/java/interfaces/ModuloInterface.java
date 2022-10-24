package interfaces;

import Models.Modulo;
import java.util.Date;
import java.util.List;

 public interface ModuloInterface {
    
    public void gravar(Modulo modulo);
    public Modulo buscar(int numero);
    public List<Modulo> buscarTodosModulos();
    
//    Tarefa gravar(String titulo);
//    void addTarefa(Tarefa tarefa);
//    void removerTarefa(Tarefa tarefa);
    
}
