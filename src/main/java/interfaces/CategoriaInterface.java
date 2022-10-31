package interfaces;

import Models.Categoria;
import java.util.Date;
import java.util.List;

 public interface CategoriaInterface {
    
    public void gravar(Categoria categoria);
    public void remover(Categoria categoria);
    public Categoria buscar(int numeroCategoria);
    public List<Categoria> buscarTodosCategorias();
    //public void editar(Categoria categoria);
    
//    Tarefa gravar(String titulo);
//    void addTarefa(Tarefa tarefa);
//    void removerTarefa(Tarefa tarefa);
}
