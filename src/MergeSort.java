public class MergeSort {

    public static void mergeSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            // Divide a primeira metade
            mergeSort(vetor, inicio, meio);

            // Divide a segunda metade
            mergeSort(vetor, meio + 1, fim);

            // Junta as duas metades ordenadas
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {

        int[] aux = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        // Compara os elementos das duas metades
        while (i <= meio && j <= fim) {

            if (vetor[i] <= vetor[j]) {
                aux[k] = vetor[i];
                i++;
            } else {
                aux[k] = vetor[j];
                j++;
            }

            k++;
        }

        // Copia o restante da primeira metade
        while (i <= meio) {
            aux[k] = vetor[i];
            i++;
            k++;
        }

        // Copia o restante da segunda metade
        while (j <= fim) {
            aux[k] = vetor[j];
            j++;
            k++;
        }

        // Copia o vetor auxiliar de volta
        for (i = inicio, k = 0; i <= fim; i++, k++) {
            vetor[i] = aux[k];
        }
    }
}