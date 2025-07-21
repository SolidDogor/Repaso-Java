/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadVocales = 0;
        
        System.out.println("Ingrese su cadena: ");
        String cadena = sc.nextLine();
        
        for (char c : cadena.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                cantidadVocales++;
            }
        }
        
        System.out.println("La cantidad de vocales en la cadena es: " + cantidadVocales);        
    }
    
}
