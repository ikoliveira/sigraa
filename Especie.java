package enums;

public enum Especie {
    CACHORRO("Cachorro"),
    GATO("Gato");

    private final String nome;

    // Construtor do enum
    Especie(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome da espécie
    public String getNome() {
        return this.nome;
    }

    // Método para obter uma espécie pelo nome
    public static Especie fromString(String nome) {
        for (Especie especie : Especie.values()) {
            if (especie.getNome().equalsIgnoreCase(nome)) {
                return especie;
            }
        }
        throw new IllegalArgumentException("Espécie não encontrada: " + nome);
    }
}
