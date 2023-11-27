package Pacotes.model;

import java.util.List;
import Pacotes.model.Hotel;
import Pacotes.model.Transporte;
import Pacotes.model.Agendamento;
import Destino.model.Destino;
import Passeio.model.*;

public abstract class Pacote<T extends Passeio> {
    private List<Destino> destinos;
    private List<Hotel> hoteis;
    private List<Transporte> transportes;
    private List<T> passeios;
    private Agendamento agendamento;

    // Construtor
    public Pacote(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes, List<T> passeios, Agendamento agendamento) {
        this.destinos = destinos;
        this.hoteis = hoteis;
        this.transportes = transportes;
        this.passeios = passeios;
        this.agendamento = agendamento;
    }

    // Getters e setters
    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public void setHoteis(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(List<Transporte> transportes) {
        this.transportes = transportes;
    }

    public List<T> getPasseios() {
        return passeios;
    }

    public void setPasseios(List<T> passeios) {
        this.passeios = passeios;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
