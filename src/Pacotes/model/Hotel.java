package Pacotes.model;
import Destino.model.Destino;

//Classe Hotel com atributos, getters e setters
public class Hotel {
 private String nome;
 private String endereco;
 private Classificacao classificacao;
 private Destino destino; // Adicionando referência ao destino

 // Construtor
 public Hotel(String nome, String endereco, Classificacao classificacao, Destino destino) {
     this.nome = nome;
     this.endereco = endereco;
     this.classificacao = classificacao;
     this.destino = destino;
     destino.adicionarHotel(this);
 }

 // Getter para o nome do hotel
 public String getNome() {
     return nome;
 }

 // Setter para o nome do hotel
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Getter para o endereço do hotel
 public String getEndereco() {
     return endereco;
 }

 // Setter para o endereço do hotel
 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 // Getter para a classificação do hotel
 public Classificacao getClassificacao() {
     return classificacao;
 }

 // Setter para a classificação do hotel
 public void setClassificacao(Classificacao classificacao) {
     this.classificacao = classificacao;
 }
 
 public Destino getDestino() {
     return destino;
 }

 // Setter para o destino
 public void setDestino(Destino destino) {
     // Removendo o hotel da lista antiga, se houver
     if (this.destino != null) {
         this.destino.getHoteis().remove(this);
     }

     // Adicionando o hotel à lista de hotéis do novo destino
     this.destino = destino;
     if (destino != null) {
         destino.adicionarHotel(this);
     }
 }
}
