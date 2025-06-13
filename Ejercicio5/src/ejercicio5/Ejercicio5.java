/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alejandro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int numeroMagico = r.nextInt(100) + 1;
        String numero;
        int intentos = 0;
        boolean adivinado = false;
        
        System.out.println("Adivina el numero! (1 - 100)");
        
        do{
            System.out.println("Ingresa tu numero: ");
            numero = sc.nextLine();
            try{
                int n1 = Integer.parseInt(numero);
                if (n1 == numeroMagico){
                    System.out.println("Adivinaste!");
                    adivinado = true;
                } else {
                    if(n1 < numeroMagico) {
                        System.out.println("Intenta mas alto!");
                    } else {
                        System.out.println("Intena mas bajo!");
                    }
                    intentos++;
                }
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido!");
            }
            
        } while (!adivinado);

        System.out.println("Felicidades, te tomaron " + intentos + " intentos!");
    }
    
}
