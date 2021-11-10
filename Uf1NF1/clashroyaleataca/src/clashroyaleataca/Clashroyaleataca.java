/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleataca;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Clashroyaleataca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Que nivel tiene tu carta?");
        int nivelcarta=teclado.nextInt();
        System.out.println("Y que nivel tiene la torre?");
        int niveltorre=teclado.nextInt();
        int fuerza = 0, vida_torre = 0, fuerza_torre=0, vida_carta=0;
        if (nivelcarta==9){
            fuerza=200;
            vida_carta=1060;
        }
        else if (nivelcarta==10){
            fuerza=220;
            vida_carta=1166;
        }
        else if (nivelcarta==11){
            fuerza=242;
            vida_carta=1282;
        }
        else if (nivelcarta==12){
            fuerza=266;
            vida_carta=1409;
        }
        else if (nivelcarta==13){
            fuerza=292;
            vida_carta=1547;
        }
        
        if (niveltorre==9){
            vida_torre=2534;
            fuerza_torre=90*2;
        
        }
        else if (niveltorre==10){
            vida_torre=2786;
            fuerza_torre=99*2;
        
        }
        else if (niveltorre==11){
            vida_torre=3052;
            fuerza_torre=109*2;
        
        }
        else if (niveltorre==12){
            vida_torre=3346;
            fuerza_torre=119*2;
        
        }
        else if (niveltorre==13){
            vida_torre=3668;
            fuerza_torre=139*2;
        
        }
        
        while(vida_torre>0 && vida_carta>0)
        {
            vida_torre=vida_torre-fuerza;
            if (vida_torre<0){
                vida_torre=0;
            }
            vida_carta=vida_carta-fuerza_torre;
            if (vida_carta<0){
                vida_carta=0;
            }
           
            System.out.println("Leñador ataco con fuerza..." + fuerza + " a la torre le queda de vida " + vida_torre);
            System.out.println("El leñador tiene... " +vida_carta );
            Thread.sleep(500);
        }
         if (vida_torre<=0 && vida_carta>=0){
                System.out.println("Ha ganado el leñador");
            }
         else if (vida_carta<=0 && vida_torre>=0){
                System.out.println("Ha ganado la torre");
            }
         else if (vida_carta>=0 && vida_torre>=0){
             System.out.println("Empate");
         }
    }
    
}
