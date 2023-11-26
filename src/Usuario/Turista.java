package Usuario;

import java.time.LocalDate;

//Classe representando um turista
public class Turista extends Usuario {
 private String endereco;

 // Construtor
 public Turista(String nome, String cpf, String email, String contato, LocalDate dataNascimento,
                String login, String password, String endereco) {
     super(nome, cpf, email, contato, dataNascimento, login, password, NivelAcesso.USER);
     this.endereco = endereco;
 }

 // Getter e setter específico para a classe Turista
 public String getEndereco() {
     return endereco;
 }

 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }
}
