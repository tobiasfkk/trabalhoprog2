package Models;

import Exception.CampoVazioException;

public class Tarefa {
    
    private int numerotarefa;
    private String dataconclusao;
    private String titulo; 
    private String datahoracriacao;
    private String prioridade;
    private String status;
    private String descricao;
   

    
    public Tarefa(int numerotarefa, String datahoracriacao, String titulo, String dataconclusao, String prioridade, String status, String descricao) {
        
        this.numerotarefa = numerotarefa;
        this.datahoracriacao = datahoracriacao;
        this.titulo = titulo;
        this.dataconclusao = dataconclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
        
    }
    
    public int getNumeroTarefa() {
        return numerotarefa;
    }
        
    public String getDatahoracriacao() { 
	return datahoracriacao;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDataConclusao(){
        return dataconclusao;
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
    
    public void setNumeroTarefa(int numerotarefa){
        this.numerotarefa = numerotarefa;
    }
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/ //n ta funcionando mas tobi vai arrumar
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
        return numerotarefa + " - " + titulo + " - "+ datahoracriacao + " - " + prioridade + " - "  + status + " - " + descricao ;
    }
    
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }

    
    
}