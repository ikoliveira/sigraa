package models;

import java.time.DayOfWeek;
import java.util.ArrayList;

import enums.Funcao;

public class Voluntario extends Pessoa {

    private Funcao funcao;
    private ArrayList<Escala> escalaTrabalho;


    public Voluntario(String nome, int idade) {
        super(nome, idade);
        setEscalaTrabalho();
        
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = Funcao.ON_SITE;
    }

    public void setEscala(Escala escala, boolean opcao) {
        if (opcao) {
            if (!this.escala.contains(escala)) {
                this.escala.add(escala);
            }
        }
        else {
            this.escala.remove(escala);
        }
    }
    

}

