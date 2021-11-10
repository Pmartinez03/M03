/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventaivafunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ventaivafunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio, nuevoprecio;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Cuanto cuesta sin iva?");
        precio=teclado.nextDouble();
        nuevoprecio=precioconiva(precio);
        System.out.println("El nuevo precio es " +nuevoprecio);
        
    }
    
    
    public static double precioconiva(double precio){
        double precioconiva, iva;
        iva=precio*21/100;
        precioconiva=iva+precio;
        
        return precioconiva;
    }
    
}
