/*Escribe un programa que calcule el M.C.D (Máximo Común Divisor) de dos
números que se piden por teclado*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        
        do{
            System.out.println("Ingrese un el primer número: ");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo valor ");
            num2 = sc.nextInt();
        } while(num1 < 0 || num2 < 0);

        int resultado = obtenerMcd(num1, num2);

        System.out.println("El MCD de " +num1 + " y " + num2+ " es: " + resultado);

        sc.close();

    }

    public static int obtenerMcd (int num1, int num2){

        int multiplicador = 1;

        //SE HALLA EL MÍNIMO VALOR porque es el máx valor por el que se puede dividir ambos números
        int menor = num1;
        if (num2 < num1) {
            menor = num2;
        }

        for (int i = 2; i <= menor; i++) {

            int resultado1, resultado2;

            while (num1 % i == 0 && num2 % i == 0) {
                resultado1 = num1/i;
                resultado2 = num2/i;

                num1 = resultado1;
                num2 = resultado2;

                multiplicador *= i;
            }
 
        }

        return multiplicador;
    }
}
