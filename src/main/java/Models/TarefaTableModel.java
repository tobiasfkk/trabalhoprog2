/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author João Pedro Parro
 */
public class TarefaTableModel extends AbstractTableModel {
    
    private List<Tarefa>tarefas;
    
    private String[] nomeColunas = {"ID","Título", "Data", "Prioridade", "Descricao"};
    
    private final int COLUNA_COD = 0;
    private final int COLUNA_TITULO = 1;
    private final int COLUNA_DATA = 2;
    private final int COLUNA_PRIORIDADE = 3;
    private final int COLUNA_DESCRICAO = 4;
    
    public TarefaTableModel(List<Tarefa>tarefas){
        this.tarefas = tarefas;
    }
    
     
    @Override
    public int getRowCount() {
        return tarefas.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return nomeColunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarefa tarefa = this.tarefas.get(rowIndex);
            switch(columnIndex){
                case COLUNA_COD:
                    return tarefa.getNumeroTarefa();
                case COLUNA_TITULO:
                    return tarefa.getTitulo();
                case COLUNA_DATA:
                    return tarefa.getData();
                case COLUNA_PRIORIDADE:
                    return tarefa.getPrioridade();
                case COLUNA_DESCRICAO:
                    return tarefa.getDescricao();
            }
            return null;
    }
    
}
