package Passeio.model;

import java.util.List;
import Destino.model.Destino;

//Classe abstrata representando um passeio genérico
public abstract class Passeio {
 private String nome;
 private String local;
 private double valor;
 private Destino destino;
 private int duracao; // em horas

 // Construtor
 public Passeio(String nome, String local, double valor, Destino destino, int duracao) {
     this.nome = nome;
     this.local = local;
     this.valor = valor;
     this.destino = destino;
     this.duracao = duracao;
 }

 // Getters e setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getLocal() {
     return local;
 }

 public void setLocal(String local) {
     this.local = local;
 }

 public double getValor() {
     return valor;
 }

 public void setValor(double valor) {
     this.valor = valor;
 }

 public Destino getDestino() {
     return destino;
 }

 public void setDestino(Destino destino) {
     this.destino = destino;
 }

 public int getDuracao() {
     return duracao;
 }

 public void setDuracao(int duracao) {
     this.duracao = duracao;
 }
}