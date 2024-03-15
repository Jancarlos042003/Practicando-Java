/* Realiza un programa que acepte tres números y devuelva el cubo de los dos
mayores.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Ingrese el primer número: ");
        a = sc.nextInt();

        do{
            System.out.println("Ingrese el segundo número: ");
            b = sc.nextInt();
        } while(b == a);

        do{
            System.out.println("Ingrese el tercer número: ");
            c = sc.nextInt();
        } while(c == a || c == b);

        int mayor = a;

        if (b>a) {
            mayor = b;
        } 
        if (c>b) {
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El cubo de los tres numeros mayores es: " + Math.pow(mayor,3));

        sc.close();
    }
}
