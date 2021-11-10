/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13descuentofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13descuentofunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioreal, preciodescuento, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es el precio real?");
        precioreal=teclado.nextDouble();
        System.out.println("Cuanto cuesta con descuento?");
        preciodescuento=teclado.nextDouble();
        descuento=descuentoPrecio(precioreal, preciodescuento);
        System.out.println("Tienes un descuento del " +descuento + "%");
        
    }
    
    public static double descuentoPrecio(double precioreal, double preciodescuento){
        
        double descuento;
        descuento=(preciodescuento*100)/precioreal;
        double descuentoreal=100-descuento;
        return descuentoreal;
        
    }
}
