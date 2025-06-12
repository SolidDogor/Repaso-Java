/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPersonas registro = new ListaPersonas();
        Scanner sc = new Scanner(System.in);
        String nom, ape, dir;
        int num, DNI;
        int opcion = 0;
        System.out.println("Bienvenido al programa para registro de personas!");

        do{
            menu();
            System.out.println("Ingrese su opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Nombre: ");  nom = sc.nextLine();
                    System.out.println("Apellido: "); ape = sc.nextLine();
                    System.out.println("DNI: "); DNI = sc.nextInt();
                    System.out.println("Telefono: "); num = sc.nextInt(); sc.nextLine();
                    System.out.println("Direccion: "); dir = sc.nextLine();

                    Persona nueva = new Persona(nom, ape, DNI, num, dir);
                    registro.agregarPersona(nueva);
                }
                case 2 -> registro.mostrarPersonas();
                case 3 -> {
                    System.out.println("Ingrese DNI a buscar: ");
                    DNI = sc.nextInt(); sc.nextLine();
                    registro.buscarPorDNI(DNI);
                }
                case 4 -> System.out.println("Saliendo del programa!");
                    
                default -> System.out.println("Opcion no implementada! Digite otra opcion");
            }
        } while(opcion != 4);
        
    }

    private static void menu() {
        System.out.println("Opcion 1: Agregar persona");
        System.out.println("Opcion 2: Ver lista de personas");
        System.out.println("Opcion 3: Buscar por DNI");
        System.out.println("Opcion 4: Salir del programa");
    }
    
}
