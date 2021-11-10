/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioportaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioPortaventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int adulto, personas, infantil, grupo10, grupo25, entrada, descuento, nuevaentrada;
        System.out.println("Cuantas personas sois? ");
        personas= teclado.nextInt();
        System.out.println("Cuantos menores hay? ");
        infantil= teclado.nextInt();
        adulto = personas-infantil;
        
        
        if(personas<10) {
            entrada=20*adulto+10*infantil;
            System.out.println("El precio total es " +entrada);
        }
        else if(personas>10 && personas<25){
            entrada=20*adulto+10*infantil;
            descuento=(entrada*25)/100;
            grupo10=entrada-descuento;
            System.out.println("El precio de todos es " +grupo10 );
        }
        else {
            entrada=20*adulto+10*infantil;
            grupo25=entrada-20;
            descuento=(entrada*25)/100;
            nuevaentrada=grupo25-descuento;
            System.out.println("El nuevo precio es " +nuevaentrada);
        }
        
        
    }
    
}
