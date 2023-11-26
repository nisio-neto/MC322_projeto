package Pacotes;

import java.util.List;
import Passeio.Passeio_Relax;
import Destino.Destino;

//Classe representando um pacote de relaxamento
public class PacoteRelax extends Pacote {
 private List<Passeio_Relax> relax;

 // Construtor
 public PacoteRelax(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                    Agendamento agendamento, List<Passeio_Relax> relax) {
     super(destinos, hoteis, transportes, agendamento);
     this.relax = relax;
 }

 // Getter e setter específico para a classe PacoteRelax
 public List<Passeio_Relax> getRelax() {
     return relax;
 }

 public void setRelax(List<Passeio_Relax> relax) {
     this.relax = relax;
 }
}
