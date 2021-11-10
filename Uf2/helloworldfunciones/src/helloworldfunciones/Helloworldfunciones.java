/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldfunciones;

/**
 *
 * @author alumne
 */
public class Helloworldfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        helloword();
        String nombre = "Pau Martínez";
        hellowordNombre(nombre);
        int valor = 5;
        System.out.println("valor no clonado antes de la funcion " +valor);
        aumentaendos(valor);
        System.out.println("valor no clonado despues de la funcion " +valor);
    }
    public static void helloword()
    {
        System.out.println("hello word en funciones");
    }
    
    /**
     * Escribira hello word acompañado del nombre
     * @param nom es la variable que contiene el nombre
     */
    
    public static void hellowordNombre(String nom){
        System.out.println("hello word " +nom + " how are you?");
    }
/**
 * Aumentara el valor que te pasan en dos 
 * @param valor tebdra el numero que te pasan desde el main
 */
    private static void aumentaendos(int valor) {
        System.out.println("valor clonado antes de ninguno cambio = " +valor);
        valor = valor + 2;
        System.out.println("valor clonado = " +valor);
        valor = valor * 2;
        System.out.println("valor clonado multiplicado por 2 = " +valor);
    }
    
}


