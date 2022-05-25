package ordenacao;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int array[], int inicio, int meio, int fim) {
        int tamanhoUm = meio - inicio + 1;
        int tamanhoDois = fim - meio;

        int arrayEsquerda[] = new int[tamanhoUm];
        int arrayDireita[] = new int[tamanhoDois];

        for (int i = 0; i < tamanhoUm; i++)
            arrayEsquerda[i] = array[inicio + i];
        for (int j = 0; j < tamanhoDois; j++)
            arrayDireita[j] = array[meio + 1 + j];

        int inicioPrimeiroArray = 0;
        int inicioSegundoArray = 0;
        int inicioSubArray = inicio;

        while (inicioPrimeiroArray < tamanhoUm && inicioSegundoArray < tamanhoDois) {
            if (arrayEsquerda[inicioPrimeiroArray] <= arrayDireita[inicioSegundoArray]) {
                array[inicioSubArray] = arrayEsquerda[inicioPrimeiroArray];
                inicioPrimeiroArray++;
            } else {
                array[inicioSubArray] = arrayDireita[inicioSegundoArray];
                inicioSegundoArray++;
            }
            inicioSubArray++;
        }

        while (inicioPrimeiroArray < tamanhoUm) {
            array[inicioSubArray] = arrayEsquerda[inicioPrimeiroArray];
            inicioPrimeiroArray++;
            inicioSubArray++;
        }

        while (inicioSegundoArray < tamanhoDois) {
            array[inicioSubArray] = arrayDireita[inicioSegundoArray];
            inicioSegundoArray++;
            inicioSubArray++;
        }
    }

    public static void mergeSort(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);
            merge(array, inicio, meio, fim);
        }
    }

    public static void main(String args[]) {
        int array[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int tamanho = array.length;
        mergeSort(array, 0, tamanho - 1);

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}