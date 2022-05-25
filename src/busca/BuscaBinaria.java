package busca;

public class BuscaBinaria {
    public static Integer buscaBinaria(int array[], int esquerda, int direita, int elemento) {
        if (direita >= esquerda) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == elemento)
                return meio;

            if (array[meio] > elemento)
                return buscaBinaria(array, esquerda, meio - 1, elemento);

            return buscaBinaria(array, meio + 1, direita, elemento);
        }
        return null;
    }

    public static void main(String args[]) {
        int array[] = { 2, 3, 4, 10, 40 };
        int tamanho = array.length;
        int elemento = 10;
        Integer posicao = buscaBinaria(array, 0, tamanho - 1, elemento);

        if (posicao == null)
            System.out.println("Elemento não encontrado");
        else
            System.out.println("Elemento encontrado na posição: " + posicao);
    }
}