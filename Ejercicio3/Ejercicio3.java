/* Ejercicio 3: Pensamiento lógico Escribe una función que tome un número entero como entrada y
 devuelva un array con todos los números enteros impares desde 1 hasta el número de entrada. Por ejemplo, 
si el número de entrada es 9, la función debería devolver [1, 3, 5, 7, 9]. */

package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Ingrese hasta que numero quiere ver los impares");
            int number = sc.nextInt();
            printOddNumbers(number);
        }

    }
    public static void printOddNumbers(int number) {
        System.out.print("Números impares: ");
        for (int i = 1; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
     
}
