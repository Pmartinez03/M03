/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle9;

/**
 *
 * @author alumne
 */
public class Bucle9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma10=0;
        int producto10=2;
        int numero;
        
        for (numero= 1; numero<=2; numero++){
            System.out.println(+suma10 +  "+" +numero);
            suma10 = suma10 + numero;
            System.out.println(producto10 + "*" +numero);
            producto10 = producto10 * numero;
        }
        
        
        
        System.out.println("La suma total es " +suma10);
        System.out.println("EL producto total es " +producto10);
    }
    
}
