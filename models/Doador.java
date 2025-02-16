package models;

import java.util.ArrayList;
import java.util.List;

public class Doador extends Pessoa {

    private List<Doacao> doacoes; 

    public Doador(String nome, int idade) {
        super(nome, idade); 
        this.doacoes = new ArrayList<>(); // Inicializa a lista de doações
    }

    public void addDoacao(Doacao doacao) {
        this.doacoes.add(doacao);
    }

    public void rmDoacao(Doacao doacao) {
        this.doacoes.remove(doacao);
    }

    public List<Doacao> getDoacoes() {
        return this.doacoes;
    }

}
