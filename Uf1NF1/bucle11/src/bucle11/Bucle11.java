/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle11;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pares=0, impar=0, contador;
                
        for(contador=100;contador<=200;contador++){
            System.out.println("El contador es " +contador);
            if(contador%2==0){
                pares = pares+contador;
            }
            else{
                impar = impar+contador;
            }
        }
        System.out.println("La suma de pares es " +pares); 
        System.out.println("La suma de impares es " +impar);
    }
    
}
