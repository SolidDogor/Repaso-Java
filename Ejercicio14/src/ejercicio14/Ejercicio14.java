/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alejandro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1; // de 1 a 100
        int intentos = 7;
        int adivinanza;
        
        System.out.println("¡Adivina el número (del 1 al 100)! Tienes " + intentos + " intentos.");

        while (intentos > 0) {
            System.out.print("Tu intento: ");
            adivinanza = sc.nextInt();

            if (adivinanza == secreto) {
                System.out.println("🎉 ¡Correcto! El número era " + secreto);
                return;
            } else if (adivinanza < secreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }

            intentos--;
            System.out.println("Te quedan " + intentos + " intentos.");
        }

        System.out.println("❌ Se acabaron los intentos. El número era: " + secreto);
    }
    
}
