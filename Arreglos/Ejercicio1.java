/*Define un array de 10 posiciones para almacenar números.
Pide al usuario que ingrese 10 números.
Muestra por consola el índice y el valor correspondiente de cada número.*/

package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        int cantidadNotas = ingresarCantidadNotas();
        double[] notasIngresadas = ingresarNotas(cantidadNotas);

        String mensaje = "";
        for (int i = 0; i < notasIngresadas.length; i++) {
            mensaje += "Nota "+(i+1)+": "+(notasIngresadas[i])+"\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int ingresarCantidadNotas() {
        int cantidad;
        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de notas: "));
        } while(cantidad <= 0);

        return cantidad;
    }

    public static double[]  ingresarNotas(int cantidadNotas){
        double nota[] = new double[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            do {
                nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar la nota " +(i+1)+ " :"));
            } while(nota[i]<0 || nota[i]>20);
        }

        return nota;
    }
}   