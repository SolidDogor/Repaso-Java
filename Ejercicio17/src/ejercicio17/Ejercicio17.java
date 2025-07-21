/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Alejandro
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        String[] palabras = frase.split("\\s+");

        System.out.println("La cantidad de palabras en la frase es: " + palabras.length);
    }
    
}
