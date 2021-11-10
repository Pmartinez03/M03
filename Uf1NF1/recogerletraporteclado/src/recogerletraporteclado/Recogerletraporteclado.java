/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recogerletraporteclado;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Recogerletraporteclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eres mayor de edad?");
        char mayoredad;
        mayoredad = teclado.nextLine().charAt(0);
        System.out.println("Has escogido " + mayoredad);
        
        if(mayoredad=='s' || mayoredad=='S')
        {
        System.out.println("- Mamá, mamá, los spaghetti se están pegando.");
        System.out.println("- Déjalos que se maten");
        }
        else if (mayoredad=='n' || mayoredad=='N'){
            System.out.println("¿Cuál es el colmo de un calvo?\n"+ 
                    "Tener ideas descabelladas.");
    }
        else
        {
        System.out.println("opcion incorrecta");
        }
    }
    
}
