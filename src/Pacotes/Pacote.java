package Pacotes;

import java.util.List;
import Pacotes.Hotel;
import Pacotes.Transporte;
import Pacotes.Agendamento;
import Destino.Destino;

public abstract class Pacote {
    private List<Destino> destinos;
    private List<Hotel> hoteis;
    private List<Transporte> transportes;
    private Agendamento agendamento;

    // Construtor
    public Pacote(List<Destino> destinos, List<Hotel> hoteis, List<Transporte> transportes, Agendamento agendamento) {
        this.destinos = destinos;
        this.hoteis = hoteis;
        this.transportes = transportes;
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

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
