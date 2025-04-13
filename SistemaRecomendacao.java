import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SistemaRecomendacao {
    private HashMap<Livro, Set<Livro>> grafo;

    public SistemaRecomendacao() {
        grafo = new HashMap<>();
    }

    // Adiciona um livro ao grafo
    public void adicionarLivro(Livro livro) {
        grafo.putIfAbsent(livro, new HashSet<>());
    }

    // Adiciona uma relação de recomendação entre livros
    public void adicionarRelacao(Livro livro, Livro recomendacao) {
        grafo.putIfAbsent(livro, new HashSet<>());
        grafo.putIfAbsent(recomendacao, new HashSet<>());
        grafo.get(livro).add(recomendacao);
    }

    // Exibe as recomendações para um livro
    public void exibirRecomendacoes(Livro livro) {
        Set<Livro> recomendacoes = grafo.get(livro);
        if (recomendacoes != null && !recomendacoes.isEmpty()) {
            System.out.println("Recomendações para o livro " + livro.getTitulo() + ":");
            for (Livro recomendado : recomendacoes) {
                System.out.println("- " + recomendado);
            }
        } else {
            System.out.println("\nNão há recomendações para o livro " + livro.getTitulo());
        }
    }
}
