package models;

import java.time.LocalDate;

public class Adocao {

    private Animal animalAdotado;  // O animal que foi adotado
    private PretendenteAdocao adotante; // O pretendente à adoção
    private LocalDate dataAdocao;  // Data da adoção
    private String termoResponsabilidade; // Termo de responsabilidade assinado

    public Adocao(Animal animalAdotado, PretendenteAdocao adotante, LocalDate dataAdocao, String termoResponsabilidade) {
        this.animalAdotado = animalAdotado;
        this.adotante = adotante;
        this.dataAdocao = dataAdocao;
        this.termoResponsabilidade = termoResponsabilidade;
    }


    public Animal getAnimalAdotado() {
        return animalAdotado;
    }

    public void setAnimalAdotado(Animal animalAdotado) {
        this.animalAdotado = animalAdotado;
    }

    public PretendenteAdocao getAdotante() {
        return adotante;
    }

    public void setAdotante(PretendenteAdocao adotante) {
        this.adotante = adotante;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getTermoResponsabilidade() {
        return termoResponsabilidade;
    }

    public void setTermoResponsabilidade(String termoResponsabilidade) {
        this.termoResponsabilidade = termoResponsabilidade;
    }

    @Override
    public String toString() {
        return "Adoção realizada em " + dataAdocao + " para o animal " + animalAdotado.getEspecie() + " com o adotante " + adotante.getNome() +
               ". Termo de responsabilidade: " + termoResponsabilidade;
    }
}
