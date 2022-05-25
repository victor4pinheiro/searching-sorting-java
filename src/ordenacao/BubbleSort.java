package ordenacao;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int array[]) {
        int tamanho = array.length;
        int tmp = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 1; j < (tamanho - i); j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 60, 35, 2, 45, 320, 5 };
        bubbleSort(array);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
