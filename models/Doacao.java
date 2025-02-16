package models;

import java.time.LocalDate;

public class Doacao {

    private String tipo; // Tipo da doação (ex: ração, medicamento)
    private int quantidade; // Quantidade doada (ex: 5 kg de ração, 10 frascos de medicamento)
    private LocalDate data; // Data da doação

    public Doacao(String tipo, int quantidade, LocalDate data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    // Métodos getter e setter para os atributos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Doação de " + quantidade + " unidades de " + tipo + " em " + data;
    }

}
