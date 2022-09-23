/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

//clase hija de DEVAPOR
public class CARGUERO extends DEVAPOR{

    public CARGUERO() {
        System.out.println("se crea la parte del barco carguero");
    }
    @Override
    public void alarma(){
        System.out.println("S.O.S desde un carguero");
    }
    
    public void alarma2(String mensaje){
        System.out.println("mensaje: "+mensaje+" enviado desde un carguero");
    }
}
