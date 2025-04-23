import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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
        grafo.get(recomendacao).add(livro);  // Para garantir que a relação seja bidirecional
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

    // =================== Dijkstra ===================
    public Map<Livro, Integer> djikstraSimples(Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafo.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }

        return distancias;
    }

    // Exibir caminhos mais curtos (em ordem crescente de distância)
    public void exibirCaminhosMaisCurtos(Livro origem) {
        Map<Livro, Integer> distancias = djikstraSimples(origem);

        System.out.println("\nLivros mais próximos de \"" + origem.getTitulo() + "\":");
        distancias.entrySet().stream()
            .filter(entry -> !entry.getKey().equals(origem))
            .sorted(Map.Entry.comparingByValue())
            .forEach(entry -> System.out.println("- " + entry.getKey() + " | Distância: " + entry.getValue()));
    }
}

