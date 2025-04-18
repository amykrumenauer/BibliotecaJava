import java.util.Random;

public class ComparadorDeAlgoritmos {

    static int comparacoesBubble = 0;
    static int comparacoesMerge = 0;

    public static void main(String[] args) {
        String[] nomesLivros = gerarNomesAleatorios(10000);

        String[] copiaBubble = nomesLivros.clone();
        String[] copiaMerge = nomesLivros.clone();

        long inicioBubble = System.nanoTime();
        bubbleSort(copiaBubble);
        long fimBubble = System.nanoTime();

        long inicioMerge = System.nanoTime();
        mergeSort(copiaMerge, 0, copiaMerge.length - 1);
        long fimMerge = System.nanoTime();

        System.out.println("\n--- R e s u l t a d o s ---");
        System.out.println("Bubble Sort:");
        System.out.println("Comparações: " + comparacoesBubble);
        System.out.println("Tempo de execução: " + (fimBubble - inicioBubble) / 1_000_000.0 + " ms");

        System.out.println("\nMerge Sort:");
        System.out.println("Comparações: " + comparacoesMerge);
        System.out.println("Tempo de execução: " + (fimMerge - inicioMerge) / 1_000_000.0 + " ms");
    }

    public static String[] gerarNomesAleatorios(int quantidade) {
        String[] nomes = new String[quantidade];
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = gerarNomeAleatorio(random);
        }
        return nomes;
    }

    public static String gerarNomeAleatorio(Random random) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int tamanho = random.nextInt(5) + 5; // nomes entre 5 e 9 letras
        StringBuilder nome = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            nome.append(alfabeto.charAt(random.nextInt(alfabeto.length())));
        }
        return nome.toString();
    }

    public static void bubbleSort(String[] array) {
        int n = array.length;
        String temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoesBubble++;
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(String[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(array, esquerda, meio);
            mergeSort(array, meio + 1, direita);
            merge(array, esquerda, meio, direita);
        }
    }

    public static void merge(String[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        String[] esquerdaArray = new String[n1];
        String[] direitaArray = new String[n2];

        for (int i = 0; i < n1; ++i)
            esquerdaArray[i] = array[esquerda + i];
        for (int j = 0; j < n2; ++j)
            direitaArray[j] = array[meio + 1 + j];

        int i = 0, j = 0, k = esquerda;

        while (i < n1 && j < n2) {
            comparacoesMerge++;
            if (esquerdaArray[i].compareTo(direitaArray[j]) <= 0) {
                array[k] = esquerdaArray[i];
                i++;
            } else {
                array[k] = direitaArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = esquerdaArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = direitaArray[j];
            j++;
            k++;
        }
    }
}
