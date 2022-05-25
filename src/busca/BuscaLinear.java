package busca;

public class BuscaLinear {
    public static Integer buscaLinear(int array[], int elemento) {
        int esquerda = 0;
        int tamanho = array.length;
        int direita = tamanho - 1;

        for (esquerda = 0; esquerda <= direita;) {
            if (array[esquerda] == elemento)
                return esquerda;

            if (array[direita] == elemento)
                return direita;

            esquerda++;
            direita--;
        }
        return null;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int elemento = 5;
        Integer posicao = buscaLinear(array, elemento);

        if (posicao == null)
            System.out.println("Elemento não encontrado");
        else
            System.out.println("Element encontrado na posição: " + posicao);
    }
}