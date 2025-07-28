/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el total de la cuenta: ");
        float totalCuenta = sc.nextFloat();
        sc.nextLine();
        System.out.println("Cuanto porcentaje desea pagar? [10%, 15%, 20%]");
        float porcentaje = sc.nextFloat();
        sc.nextLine();
        
        if (porcentaje != 10 || porcentaje != 15 || porcentaje != 20) {
            float total = totalCuenta + (totalCuenta * (porcentaje / 100) );
            System.out.println("Total a pagar (porcentaje " + porcentaje + "%): S/." + total);
        } else {
            System.out.println("Porcentaje invalido!");
        }
    }
    
}
