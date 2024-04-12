package Arreglos;

import javax.swing.JOptionPane;

/**
 * insertionSort
 */
public class insertionSort {

    public static void main(String[] args) {
        int[] array = ingresarArray();
        ingresarDatos(array);
        ordenamientoInsertionSort(array);
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

    public static void ordenamientoInsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && key < arr[j]) {
                arr[j+1] = arr[j]; 
                j--;
            }

            arr[j+1] = key;
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