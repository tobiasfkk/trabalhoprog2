/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 10264021908
 */
public class Modulo {
    
    private int numeromodulo;
    private String nomemodulo;
    private String descricaomodulo; 
    private String datahoracriacao;
    private String status;

    public Modulo(int numeromodulo, String nomemodulo, String descricaomodulo, String datahoracriacao, String status) {
        this.numeromodulo = numeromodulo;
        this.nomemodulo = nomemodulo;
        this.descricaomodulo = descricaomodulo;
        this.datahoracriacao = datahoracriacao;
        this.status = status;
    }

    public void setNumeromodulo(int numeromodulo) {
        this.numeromodulo = numeromodulo;
    }

    public void setNomemodulo(String nomemodulo) {
        this.nomemodulo = nomemodulo;
    }

    public void setDescricaomodulo(String descricaomodulo) {
        this.descricaomodulo = descricaomodulo;
    }

    public void setDatahoracriacao(String datahoracriacao) {
        this.datahoracriacao = datahoracriacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumeromodulo() {
        return numeromodulo;
    }

    public String getNomemodulo() {
        return nomemodulo;
    }

    public String getDescricaomodulo() {
        return descricaomodulo;
    }

    public String getDatahoracriacao() {
        return datahoracriacao;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return numeromodulo + " - " + nomemodulo + " - " + descricaomodulo;
    }
}
