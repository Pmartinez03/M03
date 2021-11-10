/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu edad? ");
        num = teclado.nextInt();
        if (num<18) {
            System.out.println("Eres menor de edad ");
        }
        else {
            System.out.println("Eres mayor de edad");
        }
        
        }
    }
    

