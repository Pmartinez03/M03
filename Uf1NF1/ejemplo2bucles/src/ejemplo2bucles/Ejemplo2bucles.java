/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejemplo2bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, acumulandosuma=0;
       
        
        
        
        
        
        
      //  do {      
      //  System.out.println("Introduce numero");
      //  num = teclado.nextInt();
      //  acumulandosuma=acumulandosuma + num;
      //  }
      //  while (num!=0);
      //  System.out.println("El total de la suma es " +acumulandosuma);
        //System.out.println("Has escrito 0, se termino el programa");
        boolean finalbucle = false;
        
        do {      
        System.out.println("Introduce numero hasta 100 y parara");
        num = teclado.nextInt();
        if (num>0){
            acumulandosuma=acumulandosuma + num;
        }
        else {
            System.out.println("Suma 0 ");
        }
        
        System.out.println("Suma parcial " + acumulandosuma);
        if (acumulandosuma>=100){
       
        finalbucle=true;
        }
        
        }
      while (!finalbucle);
       System.out.println("El total de la suma es " +acumulandosuma); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        do {      
//        System.out.println("Introduce numero");
//        num = teclado.nextInt();
//        if (num!=-1){
//        acumulandosuma=acumulandosuma + num;
//       System.out.println("Suma parcial " + acumulandosuma);
//       }
//
//        else {
//            finalbucle=true;
//        }
//        
//        }
//      while (!finalbucle);
//       System.out.println("El total de la suma es " +acumulandosuma);      
        
    }
    
}
