package models;

import java.util.HashMap;
import java.util.Map;

public class ControleEstoque {

    private Map<String, Integer> estoque;

    public ControleEstoque() {
        this.estoque = new HashMap<>();
    }

    public void adicionarItem(String nomeItem, int quantidade) {
        if (estoque.containsKey(nomeItem)) {
            estoque.put(nomeItem, estoque.get(nomeItem) + quantidade); // Se já existir, soma a quantidade
        } else {
            estoque.put(nomeItem, quantidade); // Se não existir, adiciona o item ao estoque
        }
    }

    public void removerItem(String nomeItem, int quantidade) {
        if (estoque.containsKey(nomeItem)) {
            int estoqueAtual = estoque.get(nomeItem);
            if (estoqueAtual >= quantidade) {
                estoque.put(nomeItem, estoqueAtual - quantidade); // Subtrai a quantidade do estoque
            } else {
                System.out.println("Erro: Quantidade insuficiente de " + nomeItem);
            }
        } else {
            System.out.println("Erro: Item " + nomeItem + " não encontrado no estoque.");
        }
    }

    public int consultarEstoque(String nomeItem) {
        return estoque.getOrDefault(nomeItem, 0); // Retorna 0 caso o item não exista no estoque
    }

    public void exibirEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Estoque atual:");
            for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
                System.out.println("Item: " + entry.getKey() + " | Quantidade: " + entry.getValue());
            }
        }
    }
}
