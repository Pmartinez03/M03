/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, contador, positivo=0, negativo=0;
        boolean cero=false;
        Scanner teclado = new Scanner(System.in);
   
        for (contador= 1; !cero; contador++) {
        System.out.println("Dime un numero ");
        num= teclado.nextInt();
        if (num!=0){
            if(num<0){
                negativo++;
            }
            else if(num>0){
                positivo++;
            }
        }
        else {
            cero=true;
        }
         
    }
        if(negativo>=0){
            System.out.println("Has introduzido " +negativo + "numeros negativos ");
            System.out.println("Hay " +positivo + " numeros positivos");
        }
        
        
    }
    
}
