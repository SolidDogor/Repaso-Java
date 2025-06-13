/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaContactos registro = new ListaContactos();
        Scanner sc = new Scanner(System.in);
        String nombre, correo;
        String telefonoStr; int telefono;
        String opcStr; int opc = 0;
        
        System.out.println("Bienvenido a Contactos");
        do {
            System.out.println("-----------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1.- Agregar contacto");
            System.out.println("2.- Ver todos los contactos");
            System.out.println("3.- Buscar contacto por nombre");
            System.out.println("4.- Salir del programa");
            
            
            do {
                System.out.println("Digite su opcion: ");
                opcStr = sc.nextLine();
            } while (!opcStr.matches("\\d{1}")); // solo si son 9 dígitos
            opc = Integer.parseInt(opcStr);
            
            switch (opc){
                case 1 -> {
                    System.out.println("-----------------------------");
                    System.out.println("Ingrese el nombre;");
                    nombre = sc.nextLine();
                    
                    do {
                        System.out.println("Ingrese el número (9 dígitos): ");
                        telefonoStr = sc.nextLine();
                    } while (!telefonoStr.matches("\\d{9}")); // solo si son 9 dígitos
                    telefono = Integer.parseInt(telefonoStr);

                    do {
                        System.out.println("Ingrese el correo: ");
                        correo = sc.nextLine();
                    } while (!correo.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$"));
                    
                    Contacto c = new Contacto(nombre,correo,telefono);
                    registro.agregarContacto(c);
                }
                case 2 -> {
                    System.out.println("-----------------------------");
                    System.out.println("Mostrando contactos");
                    System.out.println("-----------------------------");
                    registro.mostrarContactos();
                }
                case 3 -> {
                    System.out.println("-----------------------------");
                    System.out.println("Ingrese el nombre: ");
                    nombre = sc.nextLine();
                    registro.buscarPorNombre(nombre);
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida!");
            }
        } while(opc!= 4);
        
    }
    
}
