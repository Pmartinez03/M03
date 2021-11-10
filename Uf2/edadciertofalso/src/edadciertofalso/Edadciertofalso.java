/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadciertofalso;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Edadciertofalso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.println("Que edad tienes? ");
        edad = edad(sc);
        
    }
    
    public static int edad(Scanner sc) {
        int edad = 0;
        boolean mayoredad=true;
        if(edad<18){
            
        mayoredad=false;
        
        }
        
        else{
        mayoredad=true;
    }
        return edad;
        
    }
    
}
