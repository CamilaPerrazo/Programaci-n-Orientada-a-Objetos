
package p1perrazocamila;

import java.util.Scanner;


/**
 *
 * @author Perrazo Camila
 * Fecha: 08/11/2023
 */
public class P1PerrazoCamila {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        System.out.print("La suma de " + numero1 + " y " +numero2 + " es: "+suma);
    }
    
}
