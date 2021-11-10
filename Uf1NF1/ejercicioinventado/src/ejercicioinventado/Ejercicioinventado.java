/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinventado;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicioinventado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Jugar nueva partida");
        System.out.println("2- Cargar partida antigua");
        System.out.println("3- Ver records");
        System.out.println("0- Salir");
        System.out.println("Escoger opcion ");
        opcion= teclado.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Empiezas a jugar");
                break;
            case 2:
                System.out.println("Aqui es donde lo dejaste");
                break;
            case 3:
                System.out.println("El record es 7000");
                break;
            case 0:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    
}
