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
    private String arquivo;
    private String anexo; 
    private int Modulo;
   

   
    public Tarefa(int numerotarefa, String datahoracriacao, String titulo, String dataconclusao, String prioridade, String status, String descricao, String anexo) {
        this.numerotarefa = numerotarefa;
        this.datahoracriacao = datahoracriacao;
        this.titulo = titulo;
        this.dataconclusao = dataconclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.descricao = descricao;
        this.anexo = anexo;
       // this.Modulo = Modulo;
        }
             
   
    public String getAnexo() {
        return anexo;
    }


    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }    
    

    public String getDataconclusao() {
        return dataconclusao;
    }

    public int getModulo() {
        return Modulo;
    }

    public void setDataconclusao(String dataconclusao) throws CampoVazioException{
        if(dataconclusao.equalsIgnoreCase("  /  /  ")){
            throw new CampoVazioException();
        }
        this.dataconclusao = dataconclusao;
    }

    public void setDatahoracriacao(String datahoracriacao) {
        this.datahoracriacao = datahoracriacao;
    }

    public void setModulo(int Modulo) {
        this.Modulo = Modulo;
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
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/ // ta funcionando tobi é bom dms
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
        return numerotarefa + " - " + titulo + " - "+ datahoracriacao + " - " + prioridade + " - "  + status + " - " + descricao + " - " + anexo + " - " + Modulo;
    }
    
    
    /*metodo pra q retorna msg de erro caso usuario deixe o campo vazio*/
    public void setDescricao(String descricao) throws CampoVazioException {
        if(descricao.isBlank()) {
            throw new CampoVazioException();
        }  
        this.descricao = descricao;
    }

    
    
}