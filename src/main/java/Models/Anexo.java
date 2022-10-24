/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.File;

/**
 *
 * @author João Pedro Parro
 */
public class Anexo {
    private String nomeAnexo;
    private String extAnexo;
    private int numeroTarefa;
    private File anexo;

    public Anexo(String nomeAnexo, String extAnexo, int numeroTarefa, File anexo) {
        this.nomeAnexo = nomeAnexo;
        this.extAnexo = extAnexo;
        this.numeroTarefa = numeroTarefa;
        this.anexo = anexo;
    }

    public File getAnexo() {
        return anexo;
    }

    public void setAnexo(File anexo) {
        this.anexo = anexo;
    }

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public String getExtAnexo() {
        return extAnexo;
    }

    public int getNumeroTarefa() {
        return numeroTarefa;
    }

    public void setNomeAnexo(String nomeAnexo) {
        this.nomeAnexo = nomeAnexo;
    }

    public void setExtAnexo(String extAnexo) {
        this.extAnexo = extAnexo;
    }

    public void setNumeroTarefa(int numeroTarefa) {
        this.numeroTarefa = numeroTarefa;
    }
    
    
}
