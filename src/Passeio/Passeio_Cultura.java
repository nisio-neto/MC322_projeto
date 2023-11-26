package Passeio;

import Destino.Destino;
//Enum para representar os tipos de cultura

//Classe representando um passeio cultural
public class Passeio_Cultura extends Passeio {
 private String atracoes;
 private Tipo_Cultura tipoCultura;

 // Construtor
 public Passeio_Cultura(String nome, String local, double valor, Destino destino, int duracao,
                        String atracoes, Tipo_Cultura tipoCultura) {
     super(nome, local, valor, destino, duracao);
     this.atracoes = atracoes;
     this.tipoCultura = tipoCultura;
 }

 // Getters e setters específicos para a classe Passeio_Cultura
 public String getAtracoes() {
     return atracoes;
 }

 public void setAtracoes(String atracoes) {
     this.atracoes = atracoes;
 }

 public Tipo_Cultura getTipoCultura() {
     return tipoCultura;
 }

 public void setTipoCultura(Tipo_Cultura tipoCultura) {
     this.tipoCultura = tipoCultura;
 }
}
