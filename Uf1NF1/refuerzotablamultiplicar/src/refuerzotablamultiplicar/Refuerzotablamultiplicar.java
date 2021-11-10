/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzotablamultiplicar;

/**
 *
 * @author alumne
 */
public class Refuerzotablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabla = 1, contador = 1;
        
        for (tabla = 1; tabla <= 10; tabla++){
            System.out.println("tabla del " +tabla);
            
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(tabla +"*" + contador + "="+(tabla*contador));
            
            }
        }
    }
    
}
