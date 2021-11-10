/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio8funciones {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, suma;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Pon un numero ");
        n = teclado.nextInt();
        suma=suma1aN(n);
        System.out.println("La suma es " +suma); 
       
        
    }
    
    public static int suma1aN(int n){
        int aument=0, suma = 0;
        for(int i=1;i<=n;i++){
            aument=i+n;
        }
           
        return aument;
        
        }
            
        

   
}

    
   

    
     

