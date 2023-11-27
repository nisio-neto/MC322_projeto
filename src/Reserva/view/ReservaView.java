package Reserva.view;

import Pacotes.model.Pacote;
import Reserva.model.Reserva;
import javax.swing.JOptionPane;

public class ReservaView<T extends Pacote> {

    // Método para exibir informações sobre uma reserva
    public void exibirInformacoesReserva(Reserva<T> reserva) {
        StringBuilder informacoes = new StringBuilder("Detalhes da Reserva:\n");
        informacoes.append("ID: ").append(reserva.getId()).append("\n");
        informacoes.append("Informação: ").append(reserva.getInformacao()).append("\n");

        // Obtém as informações específicas do pacote associado à reserva
        Pacote pacote = reserva.getPacote();
        informacoes.append("Informações do Pacote:\n");
        informacoes.append("Destinos:\n");
        pacote.getDestinos().forEach(destino -> informacoes.append("- ").append(destino.getNome()).append("\n"));

        informacoes.append("Hoteis:\n");
        pacote.getHoteis().forEach(hotel -> informacoes.append("- ").append(hotel.getNome()).append("\n"));

        informacoes.append("Transportes:\n");
        pacote.getTransportes().forEach(transporte -> informacoes.append("- ").append(transporte.getNome()).append("\n"));

        informacoes.append("Agendamento:\n")
                .append("Ida: ").append(pacote.getAgendamento().getDataIda()).append("\n")
                .append("Volta: ").append(pacote.getAgendamento().getDataVolta()).append("\n")
                .append("Informações: ").append(pacote.getAgendamento().getInformacoes()).append("\n")
                .append("Checkin: ").append(pacote.getAgendamento().getCheckin()).append("\n")
                .append("Checkout: ").append(pacote.getAgendamento().getCheckout()).append("\n");

        JOptionPane.showMessageDialog(null, informacoes.toString(), "Informações da Reserva", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para criar uma nova reserva
    public Reserva<T> criarReserva(int id, String informacao, T pacote) {
        return new Reserva<>(id, informacao, pacote);
    }
}
