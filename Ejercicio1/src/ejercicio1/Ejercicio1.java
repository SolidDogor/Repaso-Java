/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
import ejercicio1.Persona;

/**
 *
 * @author Alejandro
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nom, ape, dir;
        int num, DNI, cantidadPersonas;
        
        System.out.println("Ingrese la cantidad de personas: ");
        cantidadPersonas = sc.nextInt();
        
        Persona[] listaPersonas = new Persona[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            sc.nextLine(); // limpiar buffer

            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nom = sc.nextLine();
            System.out.println("Ingrese el apellido de la persona " + (i + 1) + ": ");
            ape = sc.nextLine();
            System.out.println("Ingrese el DNI de la persona " + (i + 1) + ": ");
            DNI = sc.nextInt();
            System.out.println("Ingrese el numero de telefono de la persona " + (i + 1) + ": ");
            num = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            System.out.println("Ingrese la direccion de la persona " + (i + 1) + ": ");
            dir = sc.nextLine();

            Persona per = new Persona(nom, ape, DNI, num, dir);
            listaPersonas[i] = per;
        }

        System.out.println("\nMostrando registros:");
        for (int i = 0; i < cantidadPersonas; i++) {
            Persona per = listaPersonas[i];
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Nombre: " + per.getNombre());
            System.out.println("Apellido: " + per.getApellido());
            System.out.println("DNI: " + per.getDNI());
            System.out.println("Numero de telefono: " + per.getNumeroTelefono());
            System.out.println("Direccion: " + per.getDireccion());
            System.out.println("----------------------------");
        }

        
        
    }
}
