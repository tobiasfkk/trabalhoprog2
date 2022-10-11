package Models;

import Exception.CampoVazioException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import interfaces.ListaDeTarefasInterface;

public class Tarefa implements ListaDeTarefasInterface{
    
    private String titulo;    
    private String prioridade;
    private String status;
    private String descricao;
    private int data;
    //private List<Tarefa>tarefas();
    
    public Tarefa(String titulo, String prioridade, String status, String descricao) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
    }
     
    public String getTitulo() {
        return titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getData() {
        return data;
    }
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setTitulo(String titulo) throws CampoVazioException {
        if(titulo.isBlank()) {
            throw new CampoVazioException();
        }
        this.titulo = titulo;
    }

    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TarefaModels{" + "titulo=" + titulo + ", prioridade=" + prioridade + ", status=" + status + ", descricao=" + descricao + '}';
    }

    @Override
    public Tarefa buscarTarefaModelsTitulo(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tarefa buscarTarefaModelsData(int data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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