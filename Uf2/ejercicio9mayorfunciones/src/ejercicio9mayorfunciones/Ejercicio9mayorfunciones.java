/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9mayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio9mayorfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3, mayorde2;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Dime el primer numero");
        num1=teclado.nextInt();
        System.out.println("Ahora dime el segundo numero");
        num2=teclado.nextInt();
        System.out.println("Y por ultimo el tercer numero");
        num3=teclado.nextInt();
        mayorde2=mostrarResultado(num1, num2);
        int valormasgrande=mostrarResultado(num3, mayorde2);
        System.out.println("El mas grande es " +valormasgrande);
        
    }
    
    
    public static int mostrarResultado(int num1, int num2){
        
        if (num1>num2)
         return num1;
     
        else 
         return num2;
        
    
        
    
}
    
}
