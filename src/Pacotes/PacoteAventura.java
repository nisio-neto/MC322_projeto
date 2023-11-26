package Pacotes;

import java.util.List;
import Passeio.Passeio_Aventura;
import Destino.Destino;

//Classe representando um pacote de aventura
public class PacoteAventura extends Pacote {
 private List<Passeio_Aventura> aventuras;

 // Construtor
 public PacoteAventura(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                       Agendamento agendamento, List<Passeio_Aventura> aventuras) {
     super(destinos, hoteis, transportes, agendamento);
     this.aventuras = aventuras;
 }

 // Getter e setter específico para a classe PacoteAventura
 public List<Passeio_Aventura> getAventuras() {
     return aventuras;
 }

 public void setAventuras(List<Passeio_Aventura> aventuras) {
     this.aventuras = aventuras;
 }
}
