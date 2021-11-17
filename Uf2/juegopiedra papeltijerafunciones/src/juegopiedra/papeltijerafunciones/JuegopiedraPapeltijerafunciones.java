/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegopiedra.papeltijerafunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JuegopiedraPapeltijerafunciones {

    /**
     * @param args the command line arguments
     */
    //Piedra(1), Papel(2), Tijera(3);
    public static void main(String[] args) {
        // TODO code application logic here
        do{
        int jugadaUsuario=tirada_usuario();
        mostrar_jugada(jugadaUsuario);
        System.out.println("Has elegido " +jugadaUsuario);
        int jugadamaquina =tirar_ordenador();
        System.out.println("La maquina ha elegido " +jugadamaquina);
        int ganador=comprobarganador(jugadaUsuario, jugadamaquina);
        System.out.println("Ha ganado " +ganador);
        int contadorjugador= 0, contadormaquina=0;
        if (ganador==1){
            contadorjugador=aumentar_contador(contadorjugador);
        }
        else if (ganador==-1){
            contadormaquina=aumentar_contador(contadormaquina);
        }
        }
        
        
    }
    
    public static int tirar_ordenador(){
        Random r = new Random();
        int tirada = r.nextInt(3)+1;
        
        return tirada;
    }
    
    public static int tirada_usuario(){
        int apuesta;
        Scanner teclado= new Scanner(System.in);
        do{
        System.out.println("Juega al Piedra(1), Papel(2), Tijera(3)");
        apuesta=teclado.nextInt();
        }while (apuesta!=1 && apuesta!=2 && apuesta!=3);
        return apuesta;
        
    }
    
    public static int comprobarganador(int jugador, int maquina){

        if (maquina==1 && jugador==3 || maquina==2 && jugador==1 || maquina==3 && jugador==2){
            return -1;
        }
        else if (maquina==1 && jugador==1 || maquina==2 && jugador==2 || maquina==3 && jugador==3){
            return 0;
        }
        else if (jugador==1 && maquina==3 || jugador==2 && maquina==1 || jugador==3 && maquina==2){
            return 1;
        }
        
        return 2;
 
    }
    
    
    public static int aumentar_contador (int contador){
        contador++;
        return contador;
    
    }
    
    public static void mostrar_jugada (int jugada){
        switch (jugada){
            case 1:
                System.out.println("piedra");
                break;
            case 2:
                System.out.println("papel");
                break;
            case 3:
                System.out.println("tijera");
                break;
                
        }

    }
    
    public static boolean seguirJugando(int contadorj, int contadorm){
        boolean jugada = true;
        if (contadorj>=5){
            jugada = false;
        
        }
        else if (contadorm>=5){
            jugada = false;
        }
        
        
        return jugada;
    }
    
    
    
}
