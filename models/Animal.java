package models;
class Animal {

    private String nome;
    private int idade;
    private boolean sexo; // se 1: macho, se 0: femea 
    private PorteFisico porteFisico;
    private String cor;
    private Especie especie;

    public Animal(Strings nome, int idade, boolean sexo, String porteFisico, String cor, Especie especie) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setPorteFisico(porteFisico);
        this.setCor(cor);
        this.setEspecie(especie);
    }


    public String getNome() {return this.nome;}
    private void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() { return toString(this.idade); }
    private void setIdade(int idade) {

        this.idade = idade;

    }

    public boolean getSexo(){return this.sexo;}
    private void setSexo(int sexo) {

        this.sexo = sexo;
    
    }

    public PorteFisico getPorteFisico() { return toString(this.porteFisico); }
    private void setPorteFisico(PorteFisico porteFisico){

        this.porteFisico = porteFisico;

    }
    
    public String getCor() { return cor; }
    private void setCor(String cor) {

        this.cor = cor;

    }

    public Especie getEspecie() { return toString(this.especie); }
    private void setEspecie(Especie especie) {

        this.especie = especie;

    }
    

}