/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        sc.nextLine();
                
        while (numero != 0) {
            suma += (numero % 10);
            numero /= 10;
        }
        
        System.out.println("Suma de digitos: " + suma);
    }
    
}
