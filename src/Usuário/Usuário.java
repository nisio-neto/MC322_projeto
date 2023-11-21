package Usuário;

public class Usuário {
    private String nome;
    private String email;
    private String numeroTelefone; 

    // Construtor para inicializar objetos Usuario com informações relevantes
    public Usuário(String nome, String email, String numeroTelefone) {
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    // Métodos getters para acessar as informações do usuário
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }
}
