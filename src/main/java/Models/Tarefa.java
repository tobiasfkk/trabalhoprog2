package Models;

import Exception.CampoVazioException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarefa {
    
    private int numeroTarefa;
    private String titulo; 
    private String datahoracriacao;
    private String prioridade;
    private String status;
    private String descricao;
   

    
    public Tarefa(String titulo, String prioridade, String status, String descricao) {
        
        this.datahoracriacao = getDatahoracriacao();
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
        
    }
    
    public String getDatahoracriacao() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
    
    public int getNumeroTarefa() {
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
    
    public void setNumeroTarefa(int numeroTarefa){
        this.numeroTarefa = numeroTarefa;
    }
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/ //n ta funcionando
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
        return numeroTarefa + " - " + titulo + " - "+ datahoracriacao + " - " + prioridade + " - "  + status + " - " + descricao ;
    }
    
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }

    
    
}