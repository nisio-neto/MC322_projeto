package Reserva.view;

import Pacotes.model.Hotel;
import Pacotes.model.Pacote;
import Pacotes.model.Transporte;
import Passeio.model.Passeio;
import Reserva.model.Reserva;
import javax.swing.JOptionPane;

import Destino.model.Destino;

public class ReservaView<T extends Pacote> {

    // Método para exibir informações sobre uma reserva
    public void exibirInformacoesReserva(Reserva<T> reserva) {
        StringBuilder informacoes = new StringBuilder("Detalhes da Reserva:\n");
        informacoes.append("ID: ").append(reserva.getId()).append("\n");
        informacoes.append("Informação: ").append(reserva.getInformacao()).append("\n");

        // Obtém as informações específicas do pacote associado à reserva
        T pacote = reserva.getPacote();
        informacoes.append("Informações do Pacote:\n");
        informacoes.append("Destinos:\n");
        for (Object destino : pacote.getDestinos()) {
            if (destino instanceof Destino) {
                informacoes.append(((Destino) destino).getNome()).append("\n");
            }
        }

        informacoes.append("Hoteis:\n");
        for (Object hotel : pacote.getHoteis()) {
            if (hotel instanceof Hotel) {
                informacoes.append(((Hotel) hotel).getNome()).append("\n");
            }
        }

        informacoes.append("Transportes:\n");
        for (Object transporte : pacote.getTransportes()) {
            if (transporte instanceof Transporte) {
                informacoes.append(((Transporte) transporte).getNome()).append("\n");
            }
        }

        informacoes.append("Passeios:\n");
        for (Object passeio : pacote.getPasseios()) {
            if (passeio instanceof Passeio) {
                informacoes.append(((Passeio) passeio).getNome()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, informacoes.toString(), "Informações da Reserva", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para criar uma nova reserva
    public Reserva<T> criarReserva(int id, String informacao, T pacote) {
        return new Reserva<>(id, informacao, pacote);
    }
}

