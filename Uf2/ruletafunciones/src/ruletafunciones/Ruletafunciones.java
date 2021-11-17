/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletafunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ruletafunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ruleta, apuesta, dinero, conseguido=50;
        int nuevodinero=50;
        boolean comprobacion;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.println("*********** JUEGO RULETA ***********");
            
            ruleta=Tirar_Bola();
            System.out.println("Ha caido el numero " +ruleta);
            
            dinero=pedirDineroApuesta(ruleta);
            
            apuesta=PedirNumeroApuesta();
            
            comprobacion=comprobarResultado(apuesta, ruleta);
            
            if (comprobacion==true){
                System.out.println("Has ganado ");
                conseguido=calcularPremio(apuesta, apuesta);
                System.out.println(conseguido + "€");
                nuevodinero=Actualizardinero(dinero, dinero, comprobacion);
                System.out.println("Dinero disponible: " + nuevodinero + "€");
                
            }else{
                System.out.println("Has perdido");
                nuevodinero=Actualizardinero(dinero, dinero, comprobacion);
                System.out.println("Fondo disponible: " + nuevodinero + "€");
            }
            
            
        }while (SeguirJugando(dinero));
        
        System.out.println("Has salido del juego");

    }
    
    
    public static int Tirar_Bola(){
        Random r = new Random();
        int numaleatorio = r.nextInt(37);
        return numaleatorio;
    }
    
    public static int PedirNumeroApuesta(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Que numero apuestas?");
        int numero=teclado.nextInt();
        return numero;
    }
    
    public static int dinerocasa(int dinerocasa){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Cuanto dinero tienes?");
        dinerocasa=teclado.nextInt();
        return dinerocasa;
    }
    public static int pedirDineroApuesta(int dineroTengo){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Cuanto dinero apuestas?");
        dineroTengo=teclado.nextInt();
        return dineroTengo;
    }
    
    public static boolean comprobarResultado(int numeroapostado, int bola){
        boolean comprobarResultado=false;
        if (numeroapostado==bola){
            comprobarResultado=true;
        }
        else if (numeroapostado==37){
            if (bola%2==0){
                comprobarResultado=true;
            }
        }
        else if (numeroapostado==38){
            if(bola%2==1){
                comprobarResultado=true;
            }
        }
        else {
            comprobarResultado=false;
        }
        
        return comprobarResultado;
    }
    
    
    public static int calcularPremio(int numeroapostado,int cantidad){
        int premio = 0;
        if (numeroapostado>=0 && numeroapostado<=36){
            premio=cantidad*36; 
        }
        else if (numeroapostado==37 || numeroapostado==38){
            premio=cantidad*2;
        }
        return premio;
    }
    
    public static boolean SeguirJugando(int dinero){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres seguir jugando? s/n");
        char opcion = teclado.next().charAt(0);
        
        if(dinero<=0 || opcion == 'n' || opcion == 'N'){
        return false;
        }
        else if (dinero>0 || opcion=='s' || opcion=='S') {
        return true;
        }
        else {
            return false;
        }
         
    }
    
    public static int Actualizardinero(int dinero_tienes, int dinero_ganado, boolean ganado){
        if (ganado){
            dinero_tienes=dinero_tienes+dinero_ganado;
        }
        else{
            dinero_tienes=dinero_tienes-dinero_ganado;
        }
        
        return dinero_tienes;
        
    }
    
    
    
}
