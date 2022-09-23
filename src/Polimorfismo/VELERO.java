/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

//clase hija de BARCO
public class VELERO extends BARCO{

    public VELERO() {
            System.out.println("se crea la parte del barco velero");
    }
    @Override
    public void alarma(){
        System.out.println("S.O.S desde un velero");
    }
}
