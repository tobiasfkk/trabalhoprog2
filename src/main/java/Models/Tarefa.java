package Models;

public class Tarefa extends Atividade {
    
    private String anexo; 
    private int modulo;
   
    public Tarefa(int numerotarefa, String datahoracriacao, String titulo, String dataconclusao, String prioridade, String status, String descricao) {
        super(numerotarefa,datahoracriacao,titulo,dataconclusao,prioridade,status,descricao);
       // this.anexo = anexo;
       // this.Modulo = Modulo;
        }
             
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }    

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }
}