/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionconmenuexamen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Aplicacionconmenuexamen {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int menu, cont = 0, num1, num2, pares =0, i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("0.- Salir");
        System.out.println("1.- Escribir 10 veces");
        System.out.println("2.- Cuenta atras timbre");
        System.out.println("3.- Numeros pares entre 2 nombres");
        System.out.println("Elige tu opcion: ");
        menu=teclado.nextInt();
        
        if(menu==0){
            System.out.println("Programa finalizado");
        }
        else if (menu<=-1 || menu>=4){
            System.out.println("Opcion No Valida");
        }
        else if(menu==1){
        for(i=1; i<=10;i++);
        {
            System.out.println( i+ " A clase se viene a trabajar");
        }
        }
        
        else if (menu==2){
            for(i=1;i>=10;i--);
            {
            System.out.println(i+ "  ");
        }
            System.out.println("RIINNG!!!");

                }
        else if (menu==3){
            System.out.println("numero 1");
            num1=teclado.nextInt();
            System.out.println("numero 2");
            num2=teclado.nextInt();
            for(cont=0; cont<=100; cont++);
            {
                if(num1%2==0){
                   num1=pares;
                }
                System.out.println("los pares son " +pares);
            }
        
        }
        
        }
}
    

