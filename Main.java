/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16p1taller1perrazocamila;
import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("         SEDE SANTO DOMINGO            ");
        System.out.println("***************************************");
        System.out.println("   PROGRAMACION ORIENTADA A OBJETOS    ");
        System.out.println("***************************************");
        System.out.println("               TALLER 1               *");
        System.out.println("***************************************");
        System.out.println("Estudiante: Camila Perrazo");
        System.out.println("Nivel: Segundo nivel");
        System.out.println("Fecha: 10/11/2023");
        System.out.println("***************************************");
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1  / numero2;
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+suma);
        System.out.println("La multiplicacion es: "+multiplicacion); 
        System.out.println("La division es: "+division);
    }
    
}
