package ordenacao;

import java.util.Arrays;

public class HeapSort {
    public static void heapify(int array[], int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho && array[esquerda] > array[maior])
            maior = esquerda;

        if (direita < tamanho && array[direita] > array[maior])
            maior = direita;

        if (maior != i) {
            int tmp = array[i];
            array[i] = array[maior];
            array[maior] = tmp;

            heapify(array, tamanho, maior);
        }
    }

    public static void heapSort(int array[], int tamanho) {
        for (int i = tamanho / 2 - 1; i >= 0; i--)
            heapify(array, tamanho, i);

        for (int i = tamanho - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void main(String args[]) {
        int array[] = { 45, 7, 20, 40, 25, 23, -2 };
        int tamanho = array.length;
        heapSort(array, tamanho);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
