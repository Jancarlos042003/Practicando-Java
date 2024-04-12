package Arreglos;

import javax.swing.JOptionPane;

/**
 * bubbleSort
 */
public class bubbleSort {

    public static void main(String[] args) {
        int[] array = ingresarArray();
        ingresarDatos(array);
        ordenamientoBubbleSort(array);
        print(array);
    }

    public static int[] ingresarArray(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el tamaño del arreglo: "));
        int[] arr = new int[n];
        return arr;
    }

    public static void ingresarDatos(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el valor " +(i+1)+ " : "));
        }
    }

    public static void ordenamientoBubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        String mensaje = "";

        for (int numeros : arr) {
            mensaje += numeros + " ";
        }

        JOptionPane.showMessageDialog(null, "ARREGLO ORDENADO: \n" + mensaje);
    }
}