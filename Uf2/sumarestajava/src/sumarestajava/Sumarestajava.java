/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarestajava;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Sumarestajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        double resultado=0; //operacion 
        int opcion;
        valor1 = valor1positivo(sc);
        valor2 = valor2positivo(sc);
        Mostrarmenu();
        opcion = validarOpcion(sc);
        
        if(opcion == 1){
            resultado = suma(valor1,valor2);
        }else if (opcion == 2){
            resultado = resta(valor1,valor2);
        }else if (opcion == 3) {
            resultado = multi(valor1,valor2);
        }else if (opcion == 4) {
            resultado = div(valor1,valor2);
        }
        
          
        System.out.println("El resultado de la operación elegida es " + resultado);
        
    }
    public static void Mostrarmenu(){
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicación");
        System.out.println("4.- Calcular division");
        
}
        
    public static int suma(int valor1,int valor2){
        
        int total;
        total = valor1 + valor2;
        return total;
        
    }
    
    public static int resta(int valor1,int valor2){
        
        int total;
        total = valor1 - valor2;
        return total;
        
    }
    public static int multi(int valor1,int valor2){
        
        int total;
        total = valor1 * valor2;
        return total;
    
    }
    public static double div(int valor1,int valor2){
        
        double total;
        total = (double) valor1 / valor2;
        return total;
    }

    public static int validarOpcion(Scanner sc) {
        int opcion;
        do{
            
        System.out.print("Pon opcion menú:");
        opcion = sc.nextInt();
        }
        
        while(opcion<=1 || opcion>4);
        return opcion;
        
    }
    public static int valor1positivo(Scanner sc) {
        int valor1;
        do{
            
        System.out.println("Pon el primer valor");
        valor1 = sc.nextInt();
        }
        
        while(valor1<1);
        return valor1;
        
    }
     
    public static int valor2positivo(Scanner sc) {
        int valor2;
        do{
            
        System.out.println("Pon el segundo valor");
        valor2 = sc.nextInt();
        }
        
        while(valor2<1);
        return valor2;
        
    }
    
}
