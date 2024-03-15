/*
 Realiza un programa que lea de la entrada estándar un número entero positivo y 
 escriba en la salida estándar si es par o impar
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un número: ");
            num = sc.nextInt();
        } while(num <= 0);

        if (num%2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        sc.close();
    }
}
