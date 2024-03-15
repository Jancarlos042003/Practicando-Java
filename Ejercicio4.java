/*Realiza un programa que dados dos números enteros
compruebe si el primero es
divisible por el segundo o viceversa.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();

        sc.close();

        if (a%b == 0 || b%a == 0) {
            System.out.println("Son divibles");
        } else {
            System.out.println("No son divibles");
        }
    }
}
