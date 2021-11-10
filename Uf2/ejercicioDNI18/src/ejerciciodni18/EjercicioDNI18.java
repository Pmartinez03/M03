/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodni18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioDNI18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int dni;
        char letra;
        System.out.println("Dime tu DNI");
        dni= teclado.nextInt();
        
        letra=numNIF(dni);
        System.out.println("Tu letra es " +letra);
        
        
    }

    public static char numNIF(int dni){
       int div;
       div=dni%23;
        switch (div) {
            case 20:
                return 'C';
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            default:
            
                break;
        }
       
       
        System.out.println("GIT");
        return '!';
    }
    
}
