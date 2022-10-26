package interfaces;

import Models.Categoria;
import java.util.Date;
import java.util.List;

 public interface CategoriaInterface {
    
    public void gravar(Categoria modulo);
    public Categoria buscar(int numero);
    public List<Categoria> buscarTodosModulos();
    
//    Tarefa gravar(String titulo);
//    void addTarefa(Tarefa tarefa);
//    void removerTarefa(Tarefa tarefa);
    
}
