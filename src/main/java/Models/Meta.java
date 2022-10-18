/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 10264021908
 */
public class Meta {
    private int numerometa;
    private String nomemeta;
    private String descricaometa; 
    private String datahoracriacao;
    private String datahorafinal;
    private String datahoraconclusao;
    private String status;

    public Meta(int numerometa, String nomemeta, String descricaometa, String datahoracriacao, String datahorafinal, String datahoraconclusao, String status) {
        this.numerometa = numerometa;
        this.nomemeta = nomemeta;
        this.descricaometa = descricaometa;
        this.datahoracriacao = datahoracriacao;
        this.datahorafinal = datahorafinal;
        this.datahoraconclusao = datahoraconclusao;
        this.status = status;
    }

    public int getNumerometa() {
        return numerometa;
    }

    public String getNomemeta() {
        return nomemeta;
    }

    public String getDescricaometa() {
        return descricaometa;
    }

    public String getDatahoracriacao() {
        return datahoracriacao;
    }

    public String getDatahorafinal() {
        return datahorafinal;
    }

    public String getDatahoraconclusao() {
        return datahoraconclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setNumerometa(int numerometa) {
        this.numerometa = numerometa;
    }

    public void setNomemeta(String nomemeta) {
        this.nomemeta = nomemeta;
    }

    public void setDescricaometa(String descricaometa) {
        this.descricaometa = descricaometa;
    }

    public void setDatahoracriacao(String datahoracriacao) {
        this.datahoracriacao = datahoracriacao;
    }

    public void setDatahorafinal(String datahorafinal) {
        this.datahorafinal = datahorafinal;
    }

    public void setDatahoraconclusao(String datahoraconclusao) {
        this.datahoraconclusao = datahoraconclusao;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
}
