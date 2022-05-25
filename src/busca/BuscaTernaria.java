package busca;

class BuscaTernaria {
    public static Integer buscaTernaria(int esquerda, int direita, int elemento, int array[]) {
        if (direita >= esquerda) {
            int primeiroPonto = esquerda + (direita - esquerda) / 3;
            int segundoPonto = direita - (direita - esquerda) / 3;

            if (array[primeiroPonto] == elemento)
                return primeiroPonto;

            if (array[segundoPonto] == elemento)
                return segundoPonto;

            if (elemento < array[primeiroPonto])
                return buscaTernaria(esquerda, primeiroPonto - 1, elemento, array);
            else if (elemento > array[segundoPonto])
                return buscaTernaria(segundoPonto + 1, direita, elemento, array);
            else
                return buscaTernaria(primeiroPonto + 1, segundoPonto - 1, elemento, array);
        }
        return null;
    }

    public static void main(String args[]) {
        int esquerda, direita, elemento;
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        esquerda = 0;
        direita = array.length - 1;
        elemento = 7;
        Integer posicao = buscaTernaria(esquerda, direita, elemento, array);

        if (posicao == null)
            System.out.println("Elemento não encontrado");
        else
            System.out.println("Element encontrado na posição: " + posicao);
    }
}