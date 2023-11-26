package Reserva.model;

import Pacotes.model.Pacote;
//Classe representando uma reserva
public class Reserva<T extends Pacote> {
 private int id;
 private String informacao;
 private T pacote;

 // Construtor
 public Reserva(int id, String informacao, T pacote) {
     this.id = id;
     this.informacao = informacao;
     this.pacote = pacote;
 }

 // Getters e setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getInformacao() {
     return informacao;
 }

 public void setInformacao(String informacao) {
     this.informacao = informacao;
 }

 public T getPacote() {
     return pacote;
 }

 public void setPacote(T pacote) {
     this.pacote = pacote;
 }
}
