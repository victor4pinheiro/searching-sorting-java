package ordenacao;

import java.util.Arrays;

class SelectionSort {
    static void selectionSort(int array[]) {
        int tamanho = array.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int minimaPosicao = i;
            for (int j = i + 1; j < tamanho; j++)
                if (array[j] < array[minimaPosicao])
                    minimaPosicao = j;

            int tmp = array[minimaPosicao];
            array[minimaPosicao] = array[i];
            array[i] = tmp;
        }
    }

    public static void main(String args[]) {
        int array[] = { 7, 5, 2, 20, 42, 15, 23, 34, 10 };
        selectionSort(array);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
