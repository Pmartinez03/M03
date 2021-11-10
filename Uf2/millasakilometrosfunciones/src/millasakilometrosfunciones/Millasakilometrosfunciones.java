/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millasakilometrosfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Millasakilometrosfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millas, km;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantas millas quieres pasar a km?");
        millas=teclado.nextDouble();
        km= millas_a_km(millas);
        System.out.println("Esto es " +km + " kilometros");
        
        
        
    }
    
    public static double millas_a_km(double millas){
        double km;
        km=millas*1.60934;
        return km;
    }
    
}
