/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzocodigoascii;

/**
 *
 * @author alumne
 */
public class RefuerzocodigoASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra;
        int codigoASCII;
        for (letra='a'; letra<='z';letra++){
        codigoASCII  = (int) letra;
        System.out.println(letra + " = " +codigoASCII);
        }
    }
    
}
