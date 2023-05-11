/*Ejercicio 2: Nomenclatura Te presentamos el siguiente fragmento de código:
function f(x, y, z) {
let a = x + y;
let b = a * z;
let c = Math.sin(b);
return c;
}
Reemplaza los nombres de las variables con nombres más descriptivos que reflejen mejor su función.*/
import java.util.Scanner;

class Variables{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            double numero1;
            double numero2;
            double multiplier;
            System.out.println("Ingrese los numeros para a los cuales va a multiplicar y el dato de multiplicar; ");
            numero1=sc.nextDouble();
            numero2=sc.nextDouble();
            multiplier=sc.nextDouble();
            double sineValue =  calculateSineValue(numero1, numero2, multiplier);
            System.out.println(sineValue);
        }
    }

    public static double calculateSineValue(double Numero1, double Numero2, double multiplier) {
        double sum = Numero1 + Numero2;
        double product = sum * multiplier;
        double sineValue = Math.sin(product);
        return sineValue;
    }
}