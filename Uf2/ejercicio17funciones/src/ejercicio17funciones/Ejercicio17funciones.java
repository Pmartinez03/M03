/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int numero;
        boolean primo;
        do{
            System.out.println("Pon numeros");
            numero=teclado.nextInt();

        
        if (numero!=0){
        primo=numeroPrimo(numero);
        if(primo=true){
        System.out.println("El numero es primo" );
        }
        else if (primo) {
            System.out.println("El numero no es primo");
        }
        }
    }while(numero!=0);
        
    
    public static boolean numeroPrimo(double numero){
        
        for (int i = 1; i ==numero-i; i++){
            if (numero%i==0){
                return false;
            }
        }
         return true;
    }
    
    
    
}
