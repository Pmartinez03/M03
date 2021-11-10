/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tarifa, horas;
        double impuestos, sueldo_bruto, dineroimpuestos, sueldohorasreales, hora_extra, sueldohorasextra, sueldoneto, impuestosmax, dineroimpuestosmaximos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduze tu sueldo ");
        tarifa = teclado.nextInt();
        System.out.println("Introduze horas trabajadas ");
        horas = teclado.nextInt();
        
        if (horas<35){
            sueldo_bruto = tarifa + horas;
            System.out.println("Tu sueldo bruto es " + sueldo_bruto);
        }
        else {
            sueldohorasreales = 35*tarifa;
            hora_extra = horas - 35;
            sueldohorasextra = hora_extra*tarifa*1.5;
            sueldo_bruto = sueldohorasextra + sueldohorasreales;            
        }
        System.out.println("Tu sueldo bruto es " +sueldo_bruto);
        
        if (sueldo_bruto<500){
            impuestos=0;
            
        }
        
        else if (sueldo_bruto<500) {
            dineroimpuestos = sueldo_bruto - 500;
            impuestos = (dineroimpuestos * 25) /100;
        }
        else {
            dineroimpuestos = 400;
            impuestos = (dineroimpuestos * 25) /100;
            dineroimpuestos = sueldo_bruto - 500;
            impuestosmax = (dineroimpuestosmaximos*45)/100;
            
        }
        sueldoneto = sueldo_bruto - impuestos;
        System.out.println("El sueldo neto es " +sueldoneto);  
    }
    
}
