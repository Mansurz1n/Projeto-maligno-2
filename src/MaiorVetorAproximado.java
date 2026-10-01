public class MaiorVetorAproximado {

    public static void main() {
        System.out.println("Estimando o maior tamanho possivel de vertor em java");
        long inicio = System.currentTimeMillis();
        int tamanho = 1_000_000;
        int ultimo_bem_sucedidio = 0;


        while (true) {
            try {
                byte[] vetor = new byte[tamanho];
                ultimo_bem_sucedidio = tamanho;
                vetor = null;
                System.gc();

                if (tamanho > Integer.MAX_VALUE / 3 * 2) break;
                tamanho /= 2;
                tamanho *= 3;

                System.out.printf("Alocando com sucesso: %,d elementos%n", ultimo_bem_sucedidio);
            } catch (OutOfMemoryError e) {
                System.out.printf("Falhou em %,d elementos%n", tamanho);
            }
        }

        long fim = System.currentTimeMillis();
        System.out.println("\nMaior vetor que coube (aproximadamente): " +
                String.format("%,d", ultimo_bem_sucedidio));
        System.out.printf("Memoria estimada: %.2f MB%n",
                ultimo_bem_sucedidio * 1.0 / (1024 * 1024));
        System.out.printf("Tempo total: %.2f segundos%n", (fim - inicio) / 1000.0);
    }
}