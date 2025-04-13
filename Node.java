public class Node {
    Livro livro;
    Node proximo;

    // Construtor
    public Node(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }
}
