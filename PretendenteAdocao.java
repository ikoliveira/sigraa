package models;

public class PretendenteAdocao extends Pessoa {

    private String endereco; 

    public PretendenteAdocao(String nome, int idade, String endereco) {
        super(nome, idade); 
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}