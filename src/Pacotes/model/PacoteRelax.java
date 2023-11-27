package Pacotes.model;

import java.util.List;
import Passeio.model.Passeio_Relax;
import Destino.model.Destino;

// Classe representando um pacote de relaxamento
public class PacoteRelax extends Pacote<Passeio_Relax> {
    // Construtor
    public PacoteRelax(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                       Agendamento agendamento, List<Passeio_Relax> relax) {
        super(destinos, hoteis, transportes, relax, agendamento);
    }
}
