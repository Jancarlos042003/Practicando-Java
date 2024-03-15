/*
 Realiza un programa que lea tres números enteros positivos distintos e imprima el
 mayor y el menor valor de los tres. Intente que el
 programa realice el menor número de
 comparaciones posible entre los números
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        int mayor, menor;

        //Ingrasar números
        System.out.println("Ingrese el primer número: ");
        a = sc.nextInt();
        do{
            System.out.println("Ingrese el segundo número: ");
            b = sc.nextInt();
        } while(a == b);

        do{
            System.out.println("Ingrese el tercer número: ");
            c = sc.nextInt();
        } while(a == c || b == c);

        sc.close();

        // Indentificamos el mayor y menor valor
        mayor = a;
        if (a<b){
            mayor = b;
        }
        if (b<c) {
            mayor = c;
        }

        menor = a;
        if (a>b){
            menor = b;
        }
        if (b>c) {
            menor = c;
        }

        //Imprimimos el mayor y menor valor
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

}
