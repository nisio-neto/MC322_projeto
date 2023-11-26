package Usuario.model;
import java.time.LocalDate;
//Classe representando um administrador
public class Admin extends Usuario {
 private String cargo;

 // Construtor
 public Admin(String nome, String cpf, String email, String contato, LocalDate dataNascimento,
              String login, String password, String cargo) {
     super(nome, cpf, email, contato, dataNascimento, login, password, NivelAcesso.ADMIN);
     this.cargo = cargo;
 }

 // Getter e setter específico para a classe Admin
 public String getCargo() {
     return cargo;
 }

 public void setCargo(String cargo) {
     this.cargo = cargo;
 }
}
