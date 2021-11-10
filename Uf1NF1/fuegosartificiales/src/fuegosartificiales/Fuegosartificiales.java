/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuegosartificiales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Fuegosartificiales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        char jugador;
        Random r = new Random();
        int petardo1 = r.nextInt(20);
        int petardo2 = r.nextInt(20);
        int petardo3 = r.nextInt(20);
        
        System.out.println("Que petardo escoges?");
        jugador=teclado.nextLine().charAt(0);
        
        
        int lineapintada=0;
        System.out.println("P1     P2     P3     ");
        while (lineapintada<=petardo1 || lineapintada<=petardo2 || lineapintada<=petardo3){
            if (lineapintada<petardo3){
            System.out.println("*");}
            
            else {
            System.out.println(" ");}
            if (lineapintada<petardo2){
            System.out.print("*");}
            
            else {
            System.out.print(" ");}
            if (lineapintada<petardo1){
            System.out.print("*");}
            
            else {
            System.out.print(" ");}
            
            
            lineapintada++;
        }
        
        
        System.out.println("Petardo 1 " +petardo1 + " metros");
        System.out.println("Petardo 2 " +petardo2 + " metros");
        System.out.println("Petardo 3 " +petardo3 + " metros");

        
        if (jugador=='1' && petardo1>petardo2 && petardo1>petardo3){
            System.out.println("Enhorabuena tu petardo es el ganador");
            
        }
        else if (jugador=='2' && petardo2>petardo1 && petardo2>petardo3){
            System.out.println("Felicidades tu petardo llega mas lejos");
        }
        else if (jugador=='3' && petardo3>petardo1 && petardo3>petardo2){
            System.out.println("Muy bien tu petardo es el mas alto");
        }
        else {
            System.out.println("Que pena perdiste");
        }
       
            
        
        
    }
    
}
