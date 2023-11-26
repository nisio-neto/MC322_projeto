package Usuario.model;

import java.time.LocalDate;

//Classe representando um guia
public class Guia extends Pessoa {
 private String especialidade;

 // Construtor
 public Guia(String nome, String cpf, String email, String contato, LocalDate dataNascimento,
             String especialidade) {
     super(nome, cpf, email, contato, dataNascimento);
     this.especialidade = especialidade;
 }

 // Getter e setter específico para a classe Guia
 public String getEspecialidade() {
     return especialidade;
 }

 public void setEspecialidade(String especialidade) {
     this.especialidade = especialidade;
 }
}
