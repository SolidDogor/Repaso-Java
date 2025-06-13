/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadDivisiones;
        
        System.out.println("Bienvenido al programa de divisiones finitas!");
        System.out.println("Ingrese la cantidad de divisiones a hacer: ");
        cantidadDivisiones = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < cantidadDivisiones; i++){
            String divisor, dividendo;
            System.out.println("Ingrese el dividendo: ");
            dividendo = sc.nextLine();
            
            System.out.println("Ingrese el divisor: ");
            divisor = sc.nextLine();
            
            int n1, n2;
            try {
                n1 = Integer.parseInt(dividendo);
                n2 = Integer.parseInt(divisor);
                
                if(n2 == 0){
                    System.out.println("No se puede dividir con 0!");
                } else {
                    System.out.println("Division: " + (n1/n2));
                }
            } catch (NumberFormatException e) {
                System.out.println("Uno de los valores ingresados no es un numero válido.");
            }    
            
        }
        
    }
    
}
