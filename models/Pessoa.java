package models;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;
    private ArrayList<Contato> contatos;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.contatos = new ArrayList<Contato>();  
    }

    public String getNome() { return this.nome; }
    private void setNome(String nome){

        this.nome = nome;

    }

    public int getIdade() { return this.idade; }
    private void setIdade(int idade){
        
        this.idade = idade;


    }


    public List<Contato> getContatos() { return this.contatos; }
    public void addContato(String tipo, String valor ) {

        Contato novoContato = new Contato(tipo, valor);
        getContatos().add(novoContato);
    
    }

    /**
     * itera o arraylist procurando o contato certo, em seguida remove-o
     * @param valor representa o e-mail ou telefone do contato
     */
    public void rmContato(String valor) {


        ArrayList<Contato> contatos = this.getContatos();

        for (int i = 0; i < contatos.size(); i++) {

            if(contatos.get(i).getContato().equals(valor)) {
                contatos.remove(i);
                break;
            }

        }

    }



}