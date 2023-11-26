package Usuario.model;

import java.time.LocalDate;
//Enum para representar os níveis de acesso

//Classe abstrata representando um usuário
public abstract class Usuario extends Pessoa {
 private String login;
 private String password;
 private NivelAcesso acesso;

 // Construtor
 public Usuario(String nome, String cpf, String email, String contato, LocalDate dataNascimento,
                String login, String password, NivelAcesso acesso) {
     super(nome, cpf, email, contato, dataNascimento);
     this.login = login;
     this.password = password;
     this.acesso = acesso;
 }

 // Getters e setters específicos para a classe Usuario
 public String getLogin() {
     return login;
 }

 public void setLogin(String login) {
     this.login = login;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public NivelAcesso getAcesso() {
     return acesso;
 }

 public void setAcesso(NivelAcesso acesso) {
     this.acesso = acesso;
 }
}

