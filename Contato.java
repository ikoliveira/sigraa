package models;
public class Contato {

    private String tipo; //e-mail ou telefone
    private String valor; //conteúdo do e-mail ou telefone


    Public Contrato(String tipo, String valor) {

        this.setTipo(tipo);
        this.setValor(valor);

    }

    public String getTipo(){return this.tipo;}
    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {return this.valor;}
    private void setValor(String valor){
        this.valor = valor;
    }


}