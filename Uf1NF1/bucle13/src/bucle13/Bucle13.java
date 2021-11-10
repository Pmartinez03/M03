/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int minimo=1, maximo=100, numadivinado;
        char respuesta;
        do{
        numadivinado=(minimo+maximo)/2;
        System.out.println("El numero es " +numadivinado + " ?");
        System.out.println("Mayor (M), inFerior(F), Igual(I) " +numadivinado);
        respuesta = teclado.nextLine().charAt(0);
        if (respuesta=='M'){
            minimo=numadivinado;
        }
        else if (respuesta=='F'){
            maximo=numadivinado;
        }
        }while(respuesta!='I');
        System.out.println("Tu numero es " +numadivinado);
        
  }
}
