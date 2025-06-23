/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aut, tit;
        int anio;
        
        System.out.println("Ingrese el titulo del libro: ");
        tit = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        aut = sc.nextLine();
        System.out.println("Ingrese el anio de publicacion: ");
        anio = sc.nextInt();
        sc.nextLine();
        
        Libro l = new Libro(tit,aut,anio);
        System.out.println("Mostrando datos del libro: ");
        l.mostrarInfo();
        
    }
    
}
