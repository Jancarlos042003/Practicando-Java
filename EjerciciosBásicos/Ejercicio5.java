/* Realiza un programa que lea dos números por teclado 
y a continuación un carácter que indique la operación 
aritmética a realizar conellos. El programa devuelve, por
pantalla, el resultado de dicha operación*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ingresamos datos

        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();

        char caracter;

        System.out.println("Ingrese el símbolo de la operación a realizar: ");
        System.out.println("+(suma)");
        System.out.println("-(resta)");
        System.out.println("*(multiplicación)");
        System.out.println("/(división)");
        caracter = sc.next().charAt(0);

        //Validamos el caracter ingresado
        while (caracter != '+' && caracter != '-' && caracter != '*' && caracter != '/'){
            System.out.println("Ingrese un valor válido: ");
            caracter = sc.next().charAt(0);
        }

        //Imprimimos el resultado de la operación
        switch (caracter) {
            case '+':
                System.out.println("La suma de "+a+" y "+b+" es: " +(a+b));
                break;
            case '-':
                System.out.println("La resta de "+a+" y "+b+" es: " +(a-b));
                break;
            case '*':
                System.out.println("La multiplicación de "+a+" y "+b+" es: " +(a*b));
                break;
            case '/':
                System.out.println("La división de "+a+" y "+b+" es: " +(a/b));
                break;
            default:
                break;
        }

        sc.close();
    }
}
