public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca (lista encadeada)
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros organizados por temas
        // === Ficção psicológica e intensa ===
        Livro livro1 = new Livro("Psicopata Americano", "Bret Easton Ellis", 1991); // Ficção psicológica
        Livro livro2 = new Livro("Metamorfose", "Franz Kafka", 1915); // Ficção psicológica
        Livro livro3 = new Livro("Verity", "Colleen Hoover", 2018); // Thriller romântico

        // === Romance e relacionamentos ===
        Livro livro4 = new Livro("O Lado Feio do Amor", "Colleen Hoover", 2015); // Romance
        Livro livro5 = new Livro("Amores Verdadeiros", "Emily Giffin", 2013); // Romance

        // === Contemporâneos sobre comportamento humano ===
        Livro livro6 = new Livro("Pessoas Normais", "Sally Rooney", 2018); // Romance contemporâneo
        Livro livro7 = new Livro("A Gente Mira no Amor e Acerta na Solidão", "Carol Sabar", 2016); // Romance contemporâneo

        // === Autoajuda e reflexão pessoal ===
        Livro livro8 = new Livro("O livro que você gostaria que todas as pessoas que você ama lessem: (E talvez algumas que você não ame)", "Philippa Perry", 2024); // Autoajuda

        // === Clássicos filosóficos e introspectivos ===
        Livro livro9 = new Livro("A Hora da Estrela", "Clarice Lispector", 1977); // Introspectivo
        Livro livro10 = new Livro("O Expresso de Sócrates", "Edson Oliveira", 2003); // Filosofia

        // Adicionando livros à biblioteca (lista encadeada)
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);

        // Criando fila de espera e histórico de navegação
        FilaEspera filaEspera = new FilaEspera();
        HistoricoNavegacao historico = new HistoricoNavegacao();

        // Exibindo os livros da biblioteca
        System.out.println("\n--------------------------- B i b l i o t e c a ---------------------------------");
        biblioteca.imprimirLivros();

        // Simulando navegação
        historico.adicionarHistorico(livro3);
        historico.adicionarHistorico(livro9);

        // Exibindo o histórico de navegação
        historico.exibirHistorico();

        // Fila de espera
        filaEspera.adicionarFila(livro8);
        filaEspera.exibirFila();
        filaEspera.removerFila();
        filaEspera.exibirFila();

        // Exibindo último livro visualizado
        Livro ultimoVisualizado = historico.visualizarUltimoLivro();
        if (ultimoVisualizado != null) {
            System.out.println("\n-------------- Ú l t i m o  l i v r o  v i s u a l i z a d o ---------------");
            System.out.println(ultimoVisualizado);
        }

        // Sistema de recomendações
        SistemaRecomendacao sistemaRecomendacao = new SistemaRecomendacao();
        sistemaRecomendacao.adicionarLivro(livro1);
        sistemaRecomendacao.adicionarLivro(livro2);
        sistemaRecomendacao.adicionarLivro(livro3);
        sistemaRecomendacao.adicionarLivro(livro4);
        sistemaRecomendacao.adicionarLivro(livro5);
        sistemaRecomendacao.adicionarLivro(livro6);
        sistemaRecomendacao.adicionarLivro(livro7);
        sistemaRecomendacao.adicionarLivro(livro8);
        sistemaRecomendacao.adicionarLivro(livro9);
        sistemaRecomendacao.adicionarLivro(livro10);

        sistemaRecomendacao.adicionarRelacao(livro1, livro2);
        sistemaRecomendacao.adicionarRelacao(livro3, livro4);
        sistemaRecomendacao.adicionarRelacao(livro5, livro4);
        sistemaRecomendacao.adicionarRelacao(livro6, livro7);
        sistemaRecomendacao.adicionarRelacao(livro9, livro10);

        // Exibindo recomendações com base no histórico
        System.out.println("\n------------- R e c o m e n d a ç õ e s  b a s e a d a s  n o  s e u  g o s t o ! ---------------");
        for (Livro livro : historico.getHistorico()) {
            sistemaRecomendacao.exibirRecomendacoes(livro);
        }

        // ================= Árvores Binárias ===================

        // Criando a árvore binária de livros (ordenados por título)
        ArvoreBinaria arvoreLivros = new ArvoreBinaria();

        arvoreLivros.inserir(livro1);
        arvoreLivros.inserir(livro2);
        arvoreLivros.inserir(livro3);
        arvoreLivros.inserir(livro4);
        arvoreLivros.inserir(livro5);
        arvoreLivros.inserir(livro6);
        arvoreLivros.inserir(livro7);
        arvoreLivros.inserir(livro8);
        arvoreLivros.inserir(livro9);
        arvoreLivros.inserir(livro10);

        // Exibindo os livros em ordem alfabética (árvore binária)
        arvoreLivros.exibirLivros();

        // Buscar um livro específico
        String tituloBusca = "Verity";
        Livro encontrado = arvoreLivros.buscar(tituloBusca);
        if (encontrado != null) {
            System.out.println("\nLivro encontrado na árvore: " + encontrado);
        } else {
            System.out.println("\nLivro \"" + tituloBusca + "\" não encontrado na árvore.");
        }

        // Comparador de algoritmos
        ComparadorDeAlgoritmos.main(args);

        // Exibindo caminhos mais curtos
        System.out.println("\n------------- C a m i n h o s  m a i s  c u r t o s ---------------");
        sistemaRecomendacao.exibirCaminhosMaisCurtos(livro5); // Substitua pelo livro desejado
    }
}



