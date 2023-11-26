package Usuario.model;

import java.time.LocalDate;

//Classe abstrata representando uma pessoa
public abstract class Pessoa {
 private String nome;
 private String cpf;
 private String email;
 private String contato;
 private LocalDate dataNascimento;

 // Construtor
 public Pessoa(String nome, String cpf, String email, String contato, LocalDate dataNascimento) {
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     this.contato = contato;
     this.dataNascimento = dataNascimento;
 }

 // Getters e setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getCpf() {
     return cpf;
 }

 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getContato() {
     return contato;
 }

 public void setContato(String contato) {
     this.contato = contato;
 }

 public LocalDate getDataNascimento() {
     return dataNascimento;
 }

 public void setDataNascimento(LocalDate dataNascimento) {
     this.dataNascimento = dataNascimento;
 }
}
