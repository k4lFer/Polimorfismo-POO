/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author HP
 */
public class PRUEBA_BARCOS {
    public static void main(String[] args) {
        BARCO [] barco = new BARCO [3];//ARREGLO DE OBJETOS
        DEVAPOR vapor = new DEVAPOR();
        VELERO velero = new VELERO();
        CARGUERO carguero = new CARGUERO();
        
        
        
        barco[0] = vapor;
        barco[1] = velero;
        barco[2] = carguero;
        
        for(int i=0;i<3;){
            barco[i++].alarma();
            vapor = carguero;
            vapor.alarma(" a las 3 horas del puerto ");
        }
    }
}
