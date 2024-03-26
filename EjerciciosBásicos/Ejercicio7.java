/*Encontar cuantos números primos hay entre 1 y 200 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = ingresarNumero(sc);
        int primos = cantidadPrimos(numero);

        System.out.println("El número de primos es: " + primos);

    }

    //Método para ingresar un número
    public static int ingresarNumero(Scanner sc){
        int numero;
        do{
            System.out.println("Ingrese un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        return numero;
    }


    public static int cantidadPrimos(int numero){
        
        int contador = 0;

        //Lee los números desde el 2 hasta el número ingresado ya que 1 no es primo
        for (int i = 2; i <= numero; i++) {

            boolean primo = true;

            //Verificar si un número es primo
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                contador++;
            }
        }

        return contador;

    }
}
