
public class MergeSort {

    /**
     * Ordena o vetor em ordem crescente utilizando o algoritmo Merge Sort.
     *
     * @param vetor vetor que será ordenado
     */
    public static void sort(int[] vetor) {

        if (vetor == null || vetor.length < 2) {
            return;
        }

        mergeSort(vetor, 0, vetor.length - 1);
    }

    /**
     * Divide o vetor recursivamente até chegar a subvetores
     * com apenas um elemento.
     */
    private static void mergeSort(
            int[] vetor,
            int inicio,
            int fim) {

        if (inicio >= fim) {
            return;
        }

        final int meio = inicio + (fim - inicio) / 2;

        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio + 1, fim);

        merge(vetor, inicio, meio, fim);
    }

    /**
     * Intercala duas partes já ordenadas do vetor.
     */
    private static void merge(
            int[] vetor,
            int inicio,
            int meio,
            int fim) {

        final int tamanho = fim - inicio + 1;
        final int[] auxiliar = new int[tamanho];

        int esquerda = inicio;
        int direita = meio + 1;
        int posicao = 0;

        while (esquerda <= meio && direita <= fim) {

            if (vetor[esquerda] <= vetor[direita]) {
                auxiliar[posicao] = vetor[esquerda];
                esquerda++;
            } else {
                auxiliar[posicao] = vetor[direita];
                direita++;
            }

            posicao++;
        }

        while (esquerda <= meio) {
            auxiliar[posicao] = vetor[esquerda];
            esquerda++;
            posicao++;
        }

        while (direita <= fim) {
            auxiliar[posicao] = vetor[direita];
            direita++;
            posicao++;
        }

        for (int i = 0; i < tamanho; i++) {
            vetor[inicio + i] = auxiliar[i];
        }
    }
}