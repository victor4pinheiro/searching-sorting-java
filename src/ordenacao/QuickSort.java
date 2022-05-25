package ordenacao;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int array[], int minimo, int maximo) {
        if (array == null || array.length == 0)
            return;

        if (minimo >= maximo)
            return;

        int meio = minimo + (maximo - minimo) / 2;
        int pivo = array[meio];

        int i = minimo, j = maximo;
        while (i <= j) {
            while (array[i] < pivo)
                i++;

            while (array[j] > pivo)
                j--;

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        if (minimo < j)
            quickSort(array, minimo, j);

        if (maximo > i)
            quickSort(array, i, maximo);
    }

    public static void swap(int array[], int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args) {
        int array[] = { 12, 13, 24, 10, 3, 6, 90, 70 };
        int tamanho = array.length;
        quickSort(array, 0, tamanho - 1);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
