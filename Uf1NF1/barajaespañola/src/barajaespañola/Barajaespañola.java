/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barajaespañola;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Barajaespañola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int palocartas = r.nextInt(4)+1;
        int cartas = r.nextInt(12)+1;
        
        System.out.println("Has sacado " + cartas + "");
        switch(palocartas){
            case 1:
                System.out.println("de oros");
                break;
            case 2: 
                System.out.println("de copas");
                break;
            case 3:
                System.out.println("de bastos");
                break;
            case 4:
                System.out.println("de espadas");
                break;
        }
    }
    
    
}
