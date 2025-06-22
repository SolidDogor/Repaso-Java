/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nom = sc.next();
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        
        Persona p = new Persona(nom, edad);
        
        p.saludar();
    }
    
}
