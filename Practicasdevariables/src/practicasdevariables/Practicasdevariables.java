/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasdevariables;

/**
 *
 * @author alumne
 */
public class Practicasdevariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=10;
        double numeroscondecimales = 0.5;
        int doble;
        //calcular doble de numero
        doble = numero*2;
        double x= 5.25;
        boolean cierto_falso = true;
        cierto_falso= (numeroscondecimales == x);
        System.out.println("numero-> "+numero);
        System.out.println("decimales " + numeroscondecimales);
        System.out.println("su doble es " + doble);
        System.out.println("el numero x es " + x);
        System.out.println("al boleano vale " + cierto_falso);
    }
    
}
