/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Vivaruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int numero, contador = 0;
        Random r = new Random();
        int numaleatorio = r.nextInt(50)+1;
        do{
        System.out.println("Que numero crees que es?");
        numero=teclado.nextInt();
        if(numero>numaleatorio){
            System.out.println("Prueba mas bajo");
        }
        else if(numero<numaleatorio) {
            System.out.println("Prueba mas alto");
        }
            System.out.println("Te quedan " +contador + " intentos");
        contador=contador+1;
        }while(numero!=numaleatorio && contador<=8);
        System.out.println("Muy bien has acertado " +numaleatorio);
        System.out.println("Lo has intentado " +contador + " veces");
        
    }
    
    
}
