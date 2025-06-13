/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Alejandro
 */
public class Calculadora {
    private int num1, num2;
    Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void sumar(){
        System.out.println("Suma: " + (num1 + num2));
    }
    
    public void restar(){
        System.out.println("Resta: " + (num1 - num2));
    }
    
    public void multiplicar(){
        System.out.println("Multiplicacion: " + (num1 * num2));
    }
    
    public void dividir(){
        System.out.println("Division: " + (num1 / num2));
    }
    
}
