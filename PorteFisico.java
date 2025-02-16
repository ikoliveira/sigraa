public enum PorteFisico {
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande");

    private final String nome;

    // Construtor do enum
    PorteFisico(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome do porte
    public String getNome() {
        return this.nome;
    }

    // Método para obter um porte físico pelo nome
    public static PorteFisico fromString(String nome) {
        for (PorteFisico porte : PorteFisico.values()) {
            if (porte.getNome().equalsIgnoreCase(nome)) {
                return porte;
            }
        }
        throw new IllegalArgumentException("Porte físico não encontrado: " + nome);
    }
}
