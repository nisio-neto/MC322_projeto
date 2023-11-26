package Pacotes;
import Destino.Destino;


//Classe Transporte com atributos, getters e setters
public class Transporte {
 private String nome;
 private String endereco;
 private TipoTransporte tipoTransporte;
 private Destino destino; // Adicionando referência ao destino

 // Construtor
 public Transporte(String nome, String endereco, TipoTransporte tipoTransporte, Destino destino) {
     this.nome = nome;
     this.endereco = endereco;
     this.tipoTransporte = tipoTransporte;
     this.destino = destino;
     destino.adicionarTransporte(this);
 }

 // Getter para o nome do transporte
 public String getNome() {
     return nome;
 }

 // Setter para o nome do transporte
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Getter para o endereço do transporte
 public String getEndereco() {
     return endereco;
 }

 // Setter para o endereço do transporte
 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 // Getter para o tipo de transporte
 public TipoTransporte getTipoTransporte() {
     return tipoTransporte;
 }

 // Setter para o tipo de transporte
 public void setTipoTransporte(TipoTransporte tipoTransporte) {
     this.tipoTransporte = tipoTransporte;
 }
 
 public Destino getDestino() {
     return destino;
 }

 // Setter para o destino
 public void setDestino(Destino destino) {
     // Removendo o transporte da lista antiga, se houver
     if (this.destino != null) {
         this.destino.getTransportes().remove(this);
     }

     // Adicionando o transporte à lista de transportes do novo destino
     this.destino = destino;
     if (destino != null) {
         destino.adicionarTransporte(this);
     }
 }
}
