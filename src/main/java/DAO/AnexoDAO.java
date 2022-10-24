/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Anexo;
import interfaces.AnexoInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Parro
 */
public class AnexoDAO implements AnexoInterface{
    
    private static List<Anexo>anexos;
    
    public AnexoDAO(){
        if(anexos == null){
            anexos = new ArrayList<>();
        }
  
    }

    @Override
    public void gravar(Anexo anexo) {
        anexos.add(anexo);
    }

    @Override
    public Anexo buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
