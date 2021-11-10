/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorbitcoins;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Conversorbitcoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int bitcoins, XMR, moneda, monedanumero;
        double euros;
        System.out.println("Cuantas monedas tienes? ");
        monedanumero= teclado.nextInt();
        
        System.out.println("Que moneda es? 1:Bitcoin | 2:XMR ");
        moneda= teclado.nextInt();
        
        if (moneda==1){
            euros= monedanumero*49561;
            System.out.println("Este seria su saldo en € " +euros);
            
        }
        else if(moneda==2){
            euros= (monedanumero*233.81);
            System.out.println("Tu dinero en € es " +euros);
        }
        else {
            System.out.println("Elige entre 1:Bitcoin o 2:XMR");
        }
            
        
        
        
       
        
        
    }
    
}
