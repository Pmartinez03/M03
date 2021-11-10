/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4funciones;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio4funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, positivonegativo;
        Scanner teclado =new Scanner (System.in);
        System.out.println("pon un numero");
        num=teclado.nextInt();
        positivonegativo=dimesigno(num);
        if(positivonegativo==-1){
            System.out.println("Es un numero negativo");
        }
        else if (positivonegativo==1){
            System.out.println("Es un numero positivo");
        }
        else {
            System.out.println("Es un 0");
        }

        System.out.println(+positivonegativo );
        
    }
    
    
    public static int dimesigno(int a){
        if(a<0){
            return -1;
            
        }
        else if (a>0){
            return 1;
            
        }
        else {
            return 0;
        }
        

    }
    
}
