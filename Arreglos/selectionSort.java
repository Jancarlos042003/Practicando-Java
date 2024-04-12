package Arreglos;

import javax.swing.JOptionPane;

/**
 * selectionSort
 */
public class selectionSort {

    public static void main(String[] args) {
        int[] array = ingresarArray();
        ingresarDatos(array);
        ordenamientoSelectionSort(array);
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

    public static void ordenamientoSelectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
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