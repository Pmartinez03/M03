/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10fechafunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio10fechafunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes, año;
        boolean fecha=true;
        Scanner teclado = new Scanner (System.in); 
        System.out.println("Dia ");
        dia=teclado.nextInt();
        System.out.println("Mes");
        mes=teclado.nextInt();
        System.out.println("Año");
        año=teclado.nextInt();
        fecha=fechacorrecta(dia, mes, año);
    }
    
    
    public static boolean fechacorrecta(int dia, int mes, int año){
        boolean fecha=true;
        if (dia>30 || dia<1 || mes<1 || mes>12 || año<2000 || año>2025){
            fecha= false;
            System.out.println("La fecha es erronea");   
        }
        else if (dia>1 || dia<=30 || mes>1 || mes<12 || año>2000 || año<2025){
            fecha= true;
            System.out.println("La fecha es correcta");

        }
        
        return fecha;
}
    
}