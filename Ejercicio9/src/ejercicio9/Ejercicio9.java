/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaProductos registro = new ListaProductos();
        Scanner sc = new Scanner(System.in);
        String nombre;
        float precio;
        String opcStr; int opc = 0;
        
        System.out.println("Bienvenido a Productos!");
        do {
            System.out.println("-----------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1.- Agregar producto");
            System.out.println("2.- Ver todos los producto");
            System.out.println("3.- Salir del programa");
            
            
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
                    System.out.println("Ingrese el precio: ");
                    precio = sc.nextFloat();
                    sc.nextLine();
                    
                    Producto p = new Producto(nombre,precio);
                    registro.agregarProducto(p);
                }
                case 2 -> {
                    System.out.println("-----------------------------");
                    System.out.println("Mostrando contactos");
                    System.out.println("-----------------------------");
                    registro.mostrarProductos();
                }
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida!");
            }
        } while(opc!= 3);
    }
    
}
