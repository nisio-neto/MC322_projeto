package Pacotes;
import java.util.List;
import Usuario.Guia;
import Passeio.Passeio_Cultura;
import Destino.Destino;

//Classe representando um pacote de cultura
public class PacoteCultura extends Pacote {
 private List<Guia> guias;
 private List<Passeio_Cultura> culturas;

 // Construtor
 public PacoteCultura(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                      Agendamento agendamento, List<Guia> guias, List<Passeio_Cultura> culturas) {
     super(destinos, hoteis, transportes, agendamento);
     this.guias = guias;
     this.culturas = culturas;
 }

 // Getters e setters específicos para a classe PacoteCultura
 public List<Guia> getGuias() {
     return guias;
 }

 public void setGuias(List<Guia> guias) {
     this.guias = guias;
 }

 public List<Passeio_Cultura> getCulturas() {
     return culturas;
 }

 public void setCulturas(List<Passeio_Cultura> culturas) {
     this.culturas = culturas;
 }
}
