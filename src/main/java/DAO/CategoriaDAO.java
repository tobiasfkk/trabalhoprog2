package DAO;

import Models.Categoria;
import java.util.ArrayList;
import java.util.List;
import interfaces.CategoriaInterface;

public class CategoriaDAO implements CategoriaInterface{
    
    private static List<Categoria>modulos;

    public CategoriaDAO(){
        if(modulos == null)
           modulos = new ArrayList<>();
    }

    @Override
    public void gravar(Categoria modulo) {
        modulos.add(modulo);
    }

    @Override
    public Categoria buscar(int numero) {
        for(Categoria modulo : modulos){
             if (modulo.getNumeromodulo() == numero)
                 return modulo;
         }
         return null;
    }

    @Override
    public List<Categoria> buscarTodosModulos() {
        return modulos;
    }
    
      //  @Override
   // public List<Tarefa> editarTarefa() {
   //     return tarefas;
    //}

}




/*
package DAO;

import Models.Modulo;
import interfaces.ModuloInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModuloDAO implements ModuloInterface{
    
    private static Set<Modulo> modulos;

    public ModuloDAO(){
        if(modulos == null)
           modulos = new HashSet<>();
    }

    @Override
    public void gravar(Modulo modulo) {
        modulos.add(modulo);
    }

    @Override
    public Modulo buscar(int numero) {
        for(Modulo modulo : modulos){
             if (modulo.getNumeromodulo() == numero)
                 return modulo;
         }
         return null;
    }

    @Override
    public Modulo buscarTodosModulos() {
        for (Modulo modulo : modulos) {
            return modulo;
        } 
        return null;
    }
    
      //  @Override
   // public List<Tarefa> editarTarefa() {
   //     return tarefas;
    //}

}
*/