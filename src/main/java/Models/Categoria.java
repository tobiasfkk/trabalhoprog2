/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 10264021908
 */
public class Categoria {
    
    private int numerocategoria;
    private String nomecategoria;
    private String descricaocategoria; 
    private String datahoracriacao;
    private String status;

    public Categoria(int numerocategoria, String nomecategoria, String descricaocategoria, String datahoracriacao, String status) {
        this.numerocategoria = numerocategoria;
        this.nomecategoria = nomecategoria;
        this.descricaocategoria = descricaocategoria;
        this.datahoracriacao = datahoracriacao;
        this.status = status;
    }

    public void setNumeroCategoria(int numerocategoria) {
        this.numerocategoria = numerocategoria;
    }

    public void setNomeCategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }

    public void setDescricaoCategoria(String descricaocategoria) {
        this.descricaocategoria = descricaocategoria;
    }

    public void setDatahoracriacao(String datahoracriacao) {
        this.datahoracriacao = datahoracriacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumeroCategoria() {
        return numerocategoria;
    }

    public String getNomeCategoria() {
        return nomecategoria;
    }

    public String getDescricaoCategoria() {
        return descricaocategoria;
    }

    public String getDatahoracriacao() {
        return datahoracriacao;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return numerocategoria + " - " + nomecategoria + " - " + descricaocategoria;
    }
}
