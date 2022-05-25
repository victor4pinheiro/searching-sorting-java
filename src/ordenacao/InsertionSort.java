package ordenacao;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int tamanho = array.length;

        for (int passo = 1; passo < tamanho; passo++) {
            int elemento = array[passo];
            int j = passo - 1;

            while (j >= 0 && elemento < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = elemento;
        }
    }

    public static void main(String args[]) {
        int array[] = { 9, 5, 1, 4, 3 };
        insertionSort(array);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
