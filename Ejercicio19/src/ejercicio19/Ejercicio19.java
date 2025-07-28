/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();
        String invertida = "";
        
        for (int i = palabra.length() - 1; i >= 0 ; i--) {
            invertida = invertida.concat(Character.toString(palabra.charAt(i)));
        }
        
        System.out.println("Palabra invertida:" + invertida);
    }
    
}
