/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        boolean hubo10=false;
        double nota;
        
        
        do {
            System.out.println("Pon la nota");
            nota=teclado.nextInt();
        }
        while(nota!=-1);
      
        if(nota==10){
                hubo10=true;
                System.out.println("Hubo 10");
            }
            else if (nota<10){
                hubo10=false;
                System.out.println("No hubo 10");
            }
        
        
        
    }
    
}
