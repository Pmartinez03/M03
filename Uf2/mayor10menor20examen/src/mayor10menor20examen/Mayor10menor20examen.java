/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor10menor20examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Mayor10menor20examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, totalnum = 0, mayor10 = 0,suma = 0;
        
        do{
            System.out.println("Pon un numero ");
            num = teclado.nextInt();
            totalnum++;
            if (num>=10 && num<=20){
                mayor10++;
                suma=mayor10+num;
            }
            
        
        }
        while(mayor10<3);
        System.out.println("Has introducido " + totalnum + " numeros");
        System.out.println("la suma de los tres numeros es " +suma);
        
    
    }
    
}
