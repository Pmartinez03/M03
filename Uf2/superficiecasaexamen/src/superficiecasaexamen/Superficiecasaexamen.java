/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficiecasaexamen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Superficiecasaexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int metros, total = 0;
        char habitaciones;
        
        do {
            System.out.println("Cuantos metros tiene la habitacion?");
            metros=teclado.nextInt();
            System.out.println("Hay mas habitaciones?");
            habitaciones=teclado.nextLine().charAt(0);
            if(habitaciones=='s'){
                habitaciones=teclado.nextLine().charAt(0);
            System.out.println("Cuantos metros tiene la habitacion?");
            metros=teclado.nextInt();
            total=total+metros;
            }
            else if (habitaciones=='n'){
                
            }
        }while(habitaciones=='s');
    
        System.out.println("Tu casa mide " +total);
        
        
        
        
    
    }
    
}
