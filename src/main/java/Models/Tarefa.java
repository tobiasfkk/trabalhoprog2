package Models;

import Exception.CampoVazioException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import interfaces.TarefasInterface;

public class Tarefa {
    
    private static int numeroTarefa = 0;
    private String titulo; 
    private Date data = new Date();
    private String prioridade;
    private String status;
    private String descricao;
   
    private List<Tarefa>tarefas;
    
    public Tarefa(String titulo, String prioridade, String descricao) {
        this.numeroTarefa += 1;
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.status = "Nao Concluido";
        this.descricao = descricao;
        this.data = data;
        tarefas = new ArrayList<>();
        
    }

    public static int getNumeroTarefa() {
        return numeroTarefa;
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
    
    public Date getData() {
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

    @Override
    public String toString() {
        return numeroTarefa + " - " + titulo + " - "+ data + " - " + prioridade + " - "  + status + " - " + descricao ;
    }
    
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }

    
    
}