/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import interfaces.TarefasInterface;

/**
 *
 * @author João Pedro Parro
 */
public class TesteParro {
    
    public static void main(String[] args) {
        TarefasInterface ListaDeTarefas = new ListaDeTarefasList();
        
        Tarefa t1 = new Tarefa("FACULDADE", "Alto", "Realizar trabalho de prog1 e deixar essa porra pronta");
        ListaDeTarefas.addTarefa(t1);
        t1.toString();
        System.out.println(t1.toString());
        
        
    }
    
}
