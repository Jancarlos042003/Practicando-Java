/*Encontar cuantos números primos hay entre 1 y 200 */


public class Ejercicio7 {
    public static void main(String[] args) {

        //El iniciador comienza en 1 por el número '2' que quitamos en el for.
        int contador = 0;

        for (int i = 3; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    contador++;
                } 
            }
        }

        System.out.println("La cantidad de números primos es: " + (contador));
    }
}
