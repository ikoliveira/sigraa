package models;

import java.time.LocalDate;
import java.util.List;

public class Resgate {

    private LocalDate dataResgate; // Data do resgate
    private String localidade;    // Local onde o resgate ocorreu
    private List<Animal> animaisResgatados; // Lista de animais resgatados

    public Resgate(LocalDate dataResgate, String localidade, List<Animal> animaisResgatados) {
        this.dataResgate = dataResgate;
        this.localidade = localidade;
        this.animaisResgatados = animaisResgatados;
    }

    public LocalDate getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(LocalDate dataResgate) {
        this.dataResgate = dataResgate;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public List<Animal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void setAnimaisResgatados(List<Animal> animaisResgatados) {
        this.animaisResgatados = animaisResgatados;
    }

    @Override
    public String toString() {
        StringBuilder animais = new StringBuilder();
        for (Animal animal : animaisResgatados) {
            animais.append(animal.getEspecie()).append(" ").append(animal.getCor()).append(", ");
        }
        return "Resgate em " + localidade + " no dia " + dataResgate + " com os animais: " + animais.toString();
    }
}
