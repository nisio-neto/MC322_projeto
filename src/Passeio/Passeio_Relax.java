package Passeio;

import Destino.Destino;

//Classe representando um passeio de relaxamento
public class Passeio_Relax extends Passeio {
 private String mediacoes;

 // Construtor
 public Passeio_Relax(String nome, String local, double valor, Destino destino, int duracao,
                      String mediacoes) {
     super(nome, local, valor, destino, duracao);
     this.mediacoes = mediacoes;
 }

 // Getter e setter específico para a classe Passeio_Relax
 public String getMediacoes() {
     return mediacoes;
 }

 public void setMediacoes(String mediacoes) {
     this.mediacoes = mediacoes;
 }
}

