public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca (lista encadeada)
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro4 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);
        Livro livro5 = new Livro("Fahrenheit 451", "Ray Bradbury", 1953);
        Livro livro6 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro7 = new Livro("Admirável Mundo Novo", "Aldous Huxley", 1932);
        Livro livro8 = new Livro("O Sol é para Todos", "Harper Lee", 1960);
        Livro livro9 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", 1925);
        Livro livro10 = new Livro("Mataram a Cotovia", "Harper Lee", 1962);

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
        historico.adicionarHistorico(livro4);
        historico.adicionarHistorico(livro8);

        // Exibindo o histórico de navegação
        historico.exibirHistorico();

        // Fila de espera
        filaEspera.adicionarFila(livro3);
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

        sistemaRecomendacao.adicionarRelacao(livro1, livro6);
        sistemaRecomendacao.adicionarRelacao(livro2, livro4);
        sistemaRecomendacao.adicionarRelacao(livro3, livro2);
        sistemaRecomendacao.adicionarRelacao(livro1, livro2);
        sistemaRecomendacao.adicionarRelacao(livro4, livro5);
        sistemaRecomendacao.adicionarRelacao(livro7, livro9);
        sistemaRecomendacao.adicionarRelacao(livro8, livro10);

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
        String tituloBusca = "1984";
        Livro encontrado = arvoreLivros.buscar(tituloBusca);
        if (encontrado != null) {
            System.out.println("\nLivro encontrado na árvore: " + encontrado);
        } else {
            System.out.println("\nLivro \"" + tituloBusca + "\" não encontrado na árvore.");
        }

        ComparadorDeAlgoritmos.main(args);  // Chama o método main de ComparadorDeAlgoritmos
    }
}


