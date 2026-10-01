
public class MergeSort {

    /**
     * Ordena o vetor em ordem crescente utilizando o algoritmo Merge Sort.
     *
     * @param vetor vetor que será ordenado
     */
    public static void sort(byte[] vetor) {

        if (vetor == null || vetor.length < 2) {
            return;
        }

        mergeSort(vetor, (byte) 0, (byte) (vetor.length - 1));
    }

    /**
     * Divide o vetor recursivamente até chegar a subvetores
     * com apenas um elemento.
     */
    static void mergeSort(
            byte[] vetor,
            byte inicio,
            byte fim) {

        if (inicio >= fim) {
            return;
        }

        final long meio = inicio + (fim - inicio) / 2;

        mergeSort(vetor, inicio, (byte) meio);
        mergeSort(vetor, (byte) (meio + 1), fim);

        merge(vetor, inicio, (byte) meio, fim);
    }

    /**
     * Intercala duas partes já ordenadas do vetor.
     */
    private static void merge(
            byte[] vetor,
             byte inicio,
             byte meio,
            byte fim) {

        final byte tamanho = (byte) (fim - inicio + 1);
        final byte[] auxiliar = new byte[tamanho];

        byte esquerda = inicio;
        byte direita = (byte) (meio + 1);
        byte posicao = 0;

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
            vetor[inicio + i] = (byte) auxiliar[i];
        }
    }
}