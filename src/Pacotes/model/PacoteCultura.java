package Pacotes.model;
import java.util.List;
import Usuario.model.Guia;
import Passeio.model.Passeio_Cultura;
import Destino.model.Destino;

//Classe representando um pacote de cultura
public class PacoteCultura extends Pacote<Passeio_Cultura> {
    private List<Guia> guias;

    // Construtor
    public PacoteCultura(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                         Agendamento agendamento, List<Guia> guias, List<Passeio_Cultura> culturas) {
        super(destinos, hoteis, transportes, culturas, agendamento); //polimorfismo
        this.guias = guias;
    }

    // Getters e setters específicos para a classe PacoteCultura
    public List<Guia> getGuias() {
        return guias;
    }

    public void setGuias(List<Guia> guias) {
        this.guias = guias;
    }
}