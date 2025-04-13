import java.util.Stack;

public class HistoricoNavegacao {
    private Stack<Livro> historico;

    public HistoricoNavegacao() {
        historico = new Stack<>();
    }

    // Adicionar um livro ao histórico
    public void adicionarHistorico(Livro livro) {
        historico.push(livro);
        System.out.println("\nLivro \"" + livro.getTitulo() + "\" adicionado ao histórico de navegação.");
    }

    // Exibir o histórico de navegação
    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("\nO histórico de navegação está vazio.");
        } else {
            System.out.println("\n------------------- H i s t ó r i c o  d e  N a v e g a ç ã o --------------------");
            for (Livro livro : historico) {
                System.out.println(livro);
            }
        }
    }

    // Mostrar o livro mais recentemente visualizado
    public Livro visualizarUltimoLivro() {
        if (!historico.isEmpty()) {
            return historico.peek();
        } else {
            return null;
        }
    }

    // Retornar o histórico completo (método getHistorico)
    public Stack<Livro> getHistorico() {
        return historico;  // Retorna o Stack de livros do histórico
    }
}