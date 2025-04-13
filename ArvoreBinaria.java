public class ArvoreBinaria {
    private NoArvore raiz;

    // Classe interna representando cada nó da árvore
    private static class NoArvore {
        Livro livro;
        NoArvore esquerda, direita;

        public NoArvore(Livro livro) {
            this.livro = livro;
            esquerda = direita = null;
        }
    }

    // Método para inserir um livro na árvore
    public void inserir(Livro livro) {
        raiz = inserirRec(raiz, livro);
    }

    private NoArvore inserirRec(NoArvore raiz, Livro livro) {
        if (raiz == null) {
            return new NoArvore(livro);
        }

        if (livro.getTitulo().compareToIgnoreCase(raiz.livro.getTitulo()) < 0) {
            raiz.esquerda = inserirRec(raiz.esquerda, livro);
        } else if (livro.getTitulo().compareToIgnoreCase(raiz.livro.getTitulo()) > 0) {
            raiz.direita = inserirRec(raiz.direita, livro);
        }
        return raiz;
    }

    // Buscar um livro pelo título
    public Livro buscar(String titulo) {
        return buscarRec(raiz, titulo);
    }

    private Livro buscarRec(NoArvore raiz, String titulo) {
        if (raiz == null) {
            return null;
        }

        if (titulo.equalsIgnoreCase(raiz.livro.getTitulo())) {
            return raiz.livro;
        }

        if (titulo.compareToIgnoreCase(raiz.livro.getTitulo()) < 0) {
            return buscarRec(raiz.esquerda, titulo);
        } else {
            return buscarRec(raiz.direita, titulo);
        }
    }

    // Exibir livros em ordem alfabética (ordem simétrica)
    public void exibirLivros() {
        System.out.println("\n--------- L i v r o s  (ordem alfabética pelo título) ---------");
        exibirLivrosEmOrdem(raiz);
    }

    private void exibirLivrosEmOrdem(NoArvore raiz) {
        if (raiz != null) {
            exibirLivrosEmOrdem(raiz.esquerda);
            System.out.println(raiz.livro);
            exibirLivrosEmOrdem(raiz.direita);
        }
    }
}