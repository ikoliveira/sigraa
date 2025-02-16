package enums;

public enum Funcao {
    CAMPO("Campo"),
    ON_SITE("On-site");

    private final String nome;

    // Construtor do enum
    Funcao(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome da função
    public String getNome() {
        return this.nome;
    }

    // Método para obter uma função pelo nome
    public static Funcao fromString(String nome) {
        for (Funcao funcao : Funcao.values()) {
            if (funcao.getNome().equalsIgnoreCase(nome)) {
                return funcao;
            }
        }
        throw new IllegalArgumentException("Função não encontrada: " + nome);
    }
}
