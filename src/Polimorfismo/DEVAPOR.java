/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

//clase hija de BARCO
public class DEVAPOR extends BARCO{

    public DEVAPOR() {
        System.out.println("Se crea la parte del barco de vapor");
    }
    @Override//comando para sobreescrbir los metodos
    public void alarma(){
        System.out.println("S.O.S desde un barco de vapor");
    }
    public void alarma(String mensaje){
        System.out.println("mensaje: "+mensaje+" enviado desde un barco de vapor ");
    }
}
