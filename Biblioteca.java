public class Biblioteca {
    private Node head;

    public Biblioteca() {
        this.head = null;
    }

    // Método para adicionar um livro na lista
    public void adicionarLivro(Livro livro) {
        Node novoNode = new Node(livro);
        if (head == null) {
            head = novoNode;
        } else {
            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNode;
        }
    }

    // Método para imprimir todos os livros da lista
    public void imprimirLivros() {
        Node atual = head;
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }
}