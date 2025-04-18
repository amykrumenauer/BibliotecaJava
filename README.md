# 📚 Biblioteca Virtual em Java

Este é um projeto acadêmico que simula uma **biblioteca virtual**, desenvolvido em Java, com o objetivo de aplicar e integrar estruturas de dados clássicas, como **listas encadeadas**, **pilhas**, **filas**, **grafos** e **árvores binárias de busca (BST)**.

## 🚀 Funcionalidades Implementadas

- ✅ **Lista Encadeada:** Armazena todos os livros da biblioteca.
- ✅ **Fila de Espera:** Controla os livros emprestados e seus interessados.
- ✅ **Histórico de Navegação (Pilha):** Guarda o histórico dos livros visualizados.
- ✅ **Sistema de Recomendação (Grafo):** Relaciona livros semelhantes e oferece sugestões ao usuário.
- ✅ **Árvore Binária de Busca (BST):** Organiza os livros por título e permite busca eficiente.
- ✅ **Comparador de Algoritmos (Bubble Sort vs Merge Sort)**: Analisa desempenho em listas de livros com 10 mil nomes aleatórios.

## 📁 Estrutura de Arquivos

- `Main.java`: Classe principal com simulação de uso da biblioteca.
- `Livro.java`: Representa um livro (título, autor e ano).
- `Node.java`: Nó da lista encadeada da biblioteca.
- `Biblioteca.java`: Estrutura da biblioteca com lista encadeada.
- `FilaEspera.java`: Gerencia uma fila de espera para empréstimos.
- `HistoricoNavegacao.java`: Mantém um histórico com estrutura de pilha.
- `SistemaRecomendacao.java`: Implementa recomendações de leitura com um grafo.
- `ArvoreBinaria.java`: Implementa a BST com inserção, ordenação e busca.
- `ComparadorDeAlgoritmos.java` — Compara os algoritmos Bubble Sort e Merge Sort.

## 📘 Critério de Ordenação da Árvore

A **árvore binária de busca** foi implementada com ordenação **alfabética por título** dos livros. Isso permite:

- Inserções organizadas;
- Busca eficiente por título;
- Impressão dos livros em ordem crescente (in-order traversal).

## 📊 Comparação de Algoritmos de Ordenação

Através da classe `ComparadorDeAlgoritmos.java`, é realizada a comparação entre **Bubble Sort** e **Merge Sort**, aplicando ambos a uma lista com 10 mil nomes de livros gerados aleatoriamente.

| Algoritmo     | Comparações       | Tempo de Execução  |
|---------------|-------------------|--------------------|
| Bubble Sort   | ~49.995.000       | ~697 ms            |
| Merge Sort    | ~120.000          | ~6.5 ms            |

📌 Essa análise reforça o impacto da escolha do algoritmo conforme o volume de dados.

## 🔧 Como Executar

1. Clone ou baixe o repositório.
2. Compile todos os arquivos `.java`.
3. Execute a classe `Main`.

## 🧠 Aprendizados
Esse projeto proporcionou a prática de conceitos importantes em Java e Estruturas de Dados:

- Criação de estruturas customizadas;
- Uso de coleções (Stack, Queue, HashMap);
- Noções de grafos e árvores;
- Simulação de um sistema real com múltiplas funcionalidades interligadas.
- Boas práticas de programação orientada a objetos em Java.

## 👩‍💻 Desenvolvido por
Amanda — Estudante de Análise e Desenvolvimento de Sistemas na PUC-PR 💙