/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        
        System.out.println("Cree un clave: ");
        String clave = sc.nextLine();
        
        System.out.println("Para iniciar sesión ingrese su clave: ");
        do {
            String clave2 = sc.nextLine();
            if (clave2.equals(clave)) {
                System.out.println("Clave correcta!");
                System.exit(0);
            } else {
                System.out.println("Clave incorrecta! Le quedan " + (intentos - 1) + " intentos.");
            }
            intentos--;
        } while (intentos != 0);
        
        System.out.println("No ingreso la clave correcta, terminando el programa.");
    }
    
}
