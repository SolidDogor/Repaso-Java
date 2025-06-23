/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLibros listaLibros = new ListaLibros();
        Scanner sc = new Scanner(System.in);
        String aut, tit;
        int anio;
        
        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese el titulo del libro #" + (i+1) + " : ");
            tit = sc.nextLine();
            System.out.println("Ingrese el autor del libro #" + (i+1) + " : ");
            aut = sc.nextLine();
            System.out.println("Ingrese el anio de publicacion #" + (i+1) + " : ");
            anio = sc.nextInt();
            sc.nextLine();
            
            Libro l = new Libro(tit,aut,anio);
            listaLibros.agregarLibro(l);
            
        }
        
        System.out.println("Mostrando lista de libros");
        listaLibros.mostrarLibros();
        
        System.out.println("Ingrese titulo a buscar: ");
        tit = sc.nextLine();        
        listaLibros.buscarLibro(tit);
        
        System.out.println("Ingrese fecha de publicacion a buscar: ");
        anio = sc.nextInt();
        sc.nextLine();
        listaLibros.filtrarPorAnio(anio);
        
    }
    
}
