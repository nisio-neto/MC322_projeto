package Pacotes.model;

import java.util.List;
import Passeio.model.Passeio_Aventura;
import Destino.model.Destino;

// Classe representando um pacote de aventura
public class PacoteAventura extends Pacote<Passeio_Aventura> {
    // Construtor
    public PacoteAventura(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes,
                          Agendamento agendamento, List<Passeio_Aventura> aventuras) {
        super(destinos, hoteis, transportes, aventuras, agendamento);
    }
}