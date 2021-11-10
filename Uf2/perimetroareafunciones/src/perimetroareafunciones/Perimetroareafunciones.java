/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetroareafunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Perimetroareafunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        double ancho, alto, perimetro, area;
        System.out.println("Pon el ancho ");
        ancho=teclado.nextInt();
        System.out.println("Pon el alto ");
        alto=teclado.nextInt();
        perimetro=perimetroRectangulo(ancho, alto);
        System.out.println("El perimetro es " +perimetro);
        area=areaRectangulo(ancho, alto);
        System.out.println("El area es " +area);
        
    }
    
    public static double perimetroRectangulo(double ancho, double alto){
        double masancho, masalto, perimetro;
        masancho=ancho + ancho;
        masalto=alto + alto;
        perimetro=masancho+masalto;
        
        return perimetro;
    }
    public static double areaRectangulo(double ancho, double alto){
        double area;
        area=ancho*alto;
        
        return area;
    }
    
}
