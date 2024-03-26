/*scribe un programa que calcule el factorial de un
número n entero positivo, leído por teclado.*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = igresarNumero(sc);
        int resultado = factorial(numero);

        System.out.println("El factorial del número " +numero+ " es: " + resultado);
    }

    public static int igresarNumero(Scanner sc){  

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        return numero;
    }

    public static int factorial(int numero){
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
