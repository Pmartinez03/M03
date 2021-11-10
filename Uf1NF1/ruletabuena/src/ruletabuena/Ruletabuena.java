/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletabuena;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ruletabuena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado= new Scanner(System.in);
        int numero;
        int apuesta = 1;
        int dineroganado  = apuesta*36;
        Random r = new Random();
        int numaleatorio = r.nextInt(37);
        
        do{
        System.out.println("Cuanto dinero apuestas?");
        apuesta = teclado.nextInt();
        System.out.println("Que numero crees que es?");
        numero=teclado.nextInt();
        System.out.println("Que pena has perdido " +apuesta +"€");
        
        
                   
        }while(numero!=numaleatorio);
        System.out.println("El numero es " +numaleatorio);
        System.out.println("Has ganado " +dineroganado +"€");
        
        
    
    }
    
}
