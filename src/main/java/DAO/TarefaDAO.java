package DAO;

import Models.Tarefa;
import java.util.Date;
import interfaces.TarefasInterface;
import java.util.List;

public class TarefaDAO implements TarefasInterface{
    private static List<Tarefa>tarefas;
    
    @Override
    public Tarefa buscarTarefaModelsTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tarefa buscarTarefaModelsData(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tarefa> buscarTodasTarefas() {
        return tarefas;
    }

    @Override
    public void addTarefa(Tarefa tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerTarefa(Tarefa tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
