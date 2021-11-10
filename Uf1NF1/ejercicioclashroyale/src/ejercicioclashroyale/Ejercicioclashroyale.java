/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyale;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicioclashroyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int copas;
        char opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas copas tienes? ");
        copas = teclado.nextInt();
        teclado.nextLine();
        if (copas < 2000) {
            System.out.println("Elige tu carta");
            opcion = teclado.nextLine().charAt(0);
            if (opcion == 'm'||opcion =='M') {
                System.out.println("Has seleccionado el Mago electrico");
            } 
            else if (opcion == 'e'||opcion =='E') {
                System.out.println("Te has llevado el Megaesbirro");
            }
        } 
        
        else if (copas>=2000 && copas<=3000){
            
            System.out.println("Elige tu carta");
            opcion = teclado.nextLine().charAt(0);
            if (opcion== 'c'||opcion== 'C') {
                System.out.println("Has elegido caballero ");
            } 
            else if (opcion== 'b'||opcion== 'B') {
                System.out.println("Has escogido Bandida");
            }
        }
        else {
            System.out.println("Escoge entre Ejercito de esqueletos y Gigante");
            opcion = teclado.nextLine().charAt(0);
            if (opcion== 'e'||opcion== 'E') {
                System.out.println("Ejercito de esqueletos");
            } 
            else if (opcion== 'g'||opcion== 'G') {
                System.out.println("Has escogido Gigante");
            }
        }
        }

    }

