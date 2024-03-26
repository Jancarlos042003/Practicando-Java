/*Dividir dos números sin utilizar el símbolo de 
 * división ni multiplicación
 */

package Retos;

import javax.swing.JOptionPane;

class Ejercicio1 {

    public static void main(String[] args) {
        int datos[] = ingresarDatos();
        int operacion = division(datos[0], datos[1]);

        if (operacion > 0) {
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + operacion);
        } else {
            JOptionPane.showMessageDialog(null, "Estos valores no se pueden dividir.");
        }

    }

    public static int[] ingresarDatos() {
        int array[] = new int[2];
        for (int i = 0; i < 2; i++) {
            do {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el "+(i+1)+" valor: "));
            } while(array[i]<=0);
        }
        return array;
    }

    public static int division (int valor1, int valor2){
        int contador = 0;

        int mayor = valor1;
        int menor = valor2;

        if (valor1 < valor2) {
            mayor = valor2;
            menor = valor1;
        }

        int acumulador = menor;

        if (mayor % menor == 0) {
            while (acumulador <= mayor) {
                acumulador += menor;
                contador++;
            }
        } 

        return contador;
    }
}
