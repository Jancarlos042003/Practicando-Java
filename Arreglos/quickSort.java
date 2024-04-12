package Arreglos;

import javax.swing.JOptionPane;

/**
 * quickSort
 */
public class quickSort {

    public static void main(String[] args) {
        int[] array = ingresarArray();
        int n = array.length;

        ingresarDatos(array); 
        ordenamientoQuickSort(array, 0, n - 1); // A 'n' se le resta 1 determinar el índice del último elemento del arreglo
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

    private static int particion(int[] arr, int inicio, int fin){
        int i = inicio - 1;
        int pivote = arr[fin];
        for (int j = inicio; j < fin; j++) {
            if (arr[j]<=pivote) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    public static void ordenamientoQuickSort(int[] arr, int inicio, int fin){
        if (inicio < fin) {
            int indiceParticion = particion(arr, inicio, fin);
            ordenamientoQuickSort(arr, inicio, indiceParticion - 1);
            ordenamientoQuickSort(arr, indiceParticion + 1, fin);
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