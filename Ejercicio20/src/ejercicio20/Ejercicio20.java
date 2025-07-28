/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0) {
                System.out.println(i + " (par)");
            } else {
                System.out.println(i + " (impar)");
            }
        }
    }
    
}
