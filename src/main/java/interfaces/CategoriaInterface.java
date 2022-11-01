package interfaces;

import Models.Categoria;
import java.util.Date;
import java.util.List;
import java.util.Set;

 public interface CategoriaInterface {
    
    public void gravar(Categoria categoria);
    public void remover(Categoria categoria);
    public Categoria buscar(int numeroCategoria);
    public Set<Categoria> buscarTodosCategorias();
//  public List<Categoria> buscarTodosCategorias();
    public void editar(int numerocategoria, String nomecategoria, String descricaocategoria, String status);
    
//    Tarefa gravar(String titulo);
//    void addTarefa(Tarefa tarefa);
//    void removerTarefa(Tarefa tarefa);
}
