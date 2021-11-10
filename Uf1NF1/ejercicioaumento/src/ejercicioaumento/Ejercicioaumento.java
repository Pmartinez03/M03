/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioaumento;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicioaumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sueldo, aumento, sueldodescontado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduze tu sueldo gastado ");
        sueldo= teclado.nextInt();
        
        if (sueldo<800){
            aumento = (sueldo*0)/100;
            sueldodescontado = sueldo-aumento;
            System.out.println("Tu nuevo precio es " +sueldodescontado);
        }
        else if (sueldo>=800 && sueldo<=1500){
            aumento = (sueldo*6)/100;
            sueldodescontado = sueldo-aumento;
            System.out.println("Tu descuento es " +sueldodescontado);
        }
        else if (sueldo>1500 && sueldo<3000){
            aumento = (sueldo*8)/100;
            sueldodescontado = sueldo-aumento;
            System.out.println("Tu rebaja es " +sueldodescontado);        
        }
        else {
            aumento = (sueldo*10)/100;
            sueldodescontado = sueldo-aumento;
            System.out.println("Tu pagas solo " +sueldodescontado);
        }
                
    }
    
}
