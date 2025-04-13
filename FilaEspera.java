import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private Queue<Livro> fila;

    public FilaEspera() {
        fila = new LinkedList<>();
    }

    // Adicionar um livro
    public void adicionarFila(Livro livro) {
        fila.add(livro);
        System.out.println("\nLivro " + livro.getTitulo() + " adicionado à fila de espera.");
    }

    // Remover um livro
    public Livro removerFila() {
        Livro livro = fila.poll();
        if (livro != null) {
            System.out.println("Livro " + livro.getTitulo() + " retirado da fila de espera.");
        } else {
            System.out.println("A fila está vazia.");
        }
        return livro;
    }

    // Exibir todos os livros
    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila de espera está vazia.");
        } else {
            System.out.println("\n---------------------- F i l a  d e  e s p e r a ----------------------");
            for (Livro livro : fila) {
                System.out.println(livro);
            }
        }
    }
}
