package Arreglos;

import javax.swing.JOptionPane;

/**
 * mergeSort
 */
public class mergeSort {
    public static void main(String[] args) {
        int[] array = ingresarArray();
        ingresarDatos(array);
        ordenar(array, 0, array.length - 1);
        print(array);
    }

    public static int[] ingresarArray(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el tamaño del array: "));
        int[] arr = new int[n];
        return arr;
    }

    public static void ingresarDatos(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el valor " +(i+1)+": "));
        }
    }

    private static void fusionar(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j]; 
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void ordenar(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r)/2;

            ordenar(arr, l, m);
            ordenar(arr, m+1, r);

            fusionar(arr, l, m, r);
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
