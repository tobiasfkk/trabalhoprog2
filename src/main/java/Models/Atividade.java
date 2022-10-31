package Models;

import Exception.CampoVazioException;

public abstract class Atividade {   
    
    private int numeroatividade;
    private String datahoracriacao;
    private String titulo;
    private String dataconclusao;
    private String prioridade;
    private String status;
    private String descricao;

    public Atividade(int numeroatividade, String datahoracriacao, String titulo, String dataconclusao, String prioridade, String status, String descricao){
        this.numeroatividade = numeroatividade;
        this.datahoracriacao = datahoracriacao;
        this.titulo = titulo;
        this.dataconclusao = dataconclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
    }
    
    public int getNumeroTarefa(){   
        return this.numeroatividade;
    }
    
    public void setNumeroTarefa(int numeroatividade){
        this.numeroatividade = numeroatividade;
    }
    
    public String getDatahoracriacao() { 
	return this.datahoracriacao;
    }
    
    public void setDatahoracriacao(String datahoracriacao) {
        this.datahoracriacao = datahoracriacao;
    }
     
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) throws CampoVazioException {
        if(titulo.isBlank()) {
            throw new CampoVazioException();
        }
        this.titulo = titulo;
    }
    
    public String getDataConclusao(){
        return this.dataconclusao;
    }
      
    public void setDataconclusao(String dataconclusao) throws CampoVazioException{
        if(dataconclusao.equalsIgnoreCase("  /  /  ")){
            throw new CampoVazioException();
        }
        this.dataconclusao = dataconclusao;
    }
    
    public String getPrioridade() {
        return this.prioridade;
    }
    
    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }
    
    public String toString() {
        return numeroatividade + " - " + titulo + " - "+ datahoracriacao + " - " + prioridade + " - "  + status + " - " + descricao;
    }
}
    
    
    
    
    