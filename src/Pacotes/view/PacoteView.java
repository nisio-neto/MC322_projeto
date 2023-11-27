package Pacotes.view;


import javax.swing.*;
import Pacotes.model.*;
import java.util.List;
import Destino.model.*;
import Usuario.model.*;
import Passeio.model.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PacoteView<T extends Pacote> {

    // Método para adicionar um novo pacote de cultura
	public PacoteCultura adicionarPacoteCultura(List<Destino> Destinos, List<Guia> Guias, List<Hotel> Hoteis, List<Transporte> Transportes, List<Passeio_Cultura> Cultura) {
        // Listas para armazenar informações do pacote de cultura
        List<Destino> destinos = new ArrayList<>();
        List<Hotel> hoteis = new ArrayList<>();
        List<Transporte> transportes = new ArrayList<>();
        List<Guia> guias = new ArrayList<>();
        List<Passeio_Cultura> culturas = new ArrayList<>();

        // Adicionar Destinos
        JOptionPane.showMessageDialog(null, "Selecione os destinos a serem adicionados:");
        adicionarDestinoInterativo(Destinos,destinos);

        // Adicionar Hotéis
        JOptionPane.showMessageDialog(null, "Selecione os hoteis a serem adicionados:");
        adicionarHotelInterativo(Hoteis, hoteis);

        // Adicionar Transportes
        JOptionPane.showMessageDialog(null, "Selecione os transportes a serem adicionados:");
        adicionarTransporteInterativo(Transportes, transportes);

        // Adicionar Guias
        JOptionPane.showMessageDialog(null, "Selecione os guias a serem adicionados:");
		adicionarGuiaInterativo(Guias, guias);
		

        // Adicionar Passeios de Cultura
		JOptionPane.showMessageDialog(null, "Selecione os passeios culturais a serem adicionados:");
        adicionarPasseioInterativo(Cultura, culturas);

        // Adicionar informações de agendamento manualmente
        
        Agendamento agendamento = adicionarAgendamentoInterativo();

        // Criar e retornar o PacoteCultura
        PacoteCultura pacoteCultura = new PacoteCultura(destinos, hoteis, transportes, agendamento, guias, culturas);
        JOptionPane.showMessageDialog(null, "Pacote de Cultura adicionado com sucesso!");
        return pacoteCultura;
    }

    // Método para adicionar um novo pacote de aventura
	public PacoteRelax adicionarPacoteRelax(List<Destino> destinos, List<Guia> guias, List<Hotel> hoteis, List<Transporte> transportes, List<Passeio_Relax> relax) {
	    List<Destino> destinosRelax = new ArrayList<>();
	    List<Hotel> hoteisRelax = new ArrayList<>();
	    List<Transporte> transportesRelax = new ArrayList<>();
	    List<Passeio_Relax> relaxacoes = new ArrayList<>();

	    // Adicionar Destinos
	    JOptionPane.showMessageDialog(null, "Selecione os destinos a serem adicionados:");
	    adicionarDestinoInterativo(destinos, destinosRelax);

	    // Adicionar Hotéis
	    JOptionPane.showMessageDialog(null, "Selecione os hoteis a serem adicionados:");
	    adicionarHotelInterativo(hoteis, hoteisRelax);

	    // Adicionar Transportes
	    JOptionPane.showMessageDialog(null, "Selecione os transportes a serem adicionados:");
	    adicionarTransporteInterativo(transportes, transportesRelax);

	    // Adicionar Passeios de Relaxamento
	    JOptionPane.showMessageDialog(null, "Selecione os passeios de relaxamento a serem adicionados:");
	    adicionarPasseioInterativo(relax, relaxacoes);

	    // Adicionar informações de agendamento manualmente
	    Agendamento agendamento = adicionarAgendamentoInterativo();

	    // Criar e retornar o PacoteRelax
	    PacoteRelax pacoteRelax = new PacoteRelax(destinosRelax, hoteisRelax, transportesRelax, agendamento, relaxacoes);
	    JOptionPane.showMessageDialog(null, "Pacote de Relaxamento adicionado com sucesso!");
	    return pacoteRelax;
	}

	public PacoteAventura adicionarPacoteAventura(List<Destino> destinos, List<Guia> guias, List<Hotel> hoteis, List<Transporte> transportes, List<Passeio_Aventura> aventuras) {
	    List<Destino> destinosAventura = new ArrayList<>();
	    List<Hotel> hoteisAventura = new ArrayList<>();
	    List<Transporte> transportesAventura = new ArrayList<>();
	    List<Passeio_Aventura> aventurasList = new ArrayList<>();

	    // Adicionar Destinos
	    JOptionPane.showMessageDialog(null, "Selecione os destinos a serem adicionados:");
	    adicionarDestinoInterativo(destinos, destinosAventura);

	    // Adicionar Hotéis
	    JOptionPane.showMessageDialog(null, "Selecione os hoteis a serem adicionados:");
	    adicionarHotelInterativo(hoteis, hoteisAventura);

	    // Adicionar Transportes
	    JOptionPane.showMessageDialog(null, "Selecione os transportes a serem adicionados:");
	    adicionarTransporteInterativo(transportes, transportesAventura);

	    // Adicionar Passeios de Aventura
	    JOptionPane.showMessageDialog(null, "Selecione os passeios de aventura a serem adicionados:");
	    adicionarPasseioInterativo(aventuras, aventurasList);

	    // Adicionar informações de agendamento manualmente
	    Agendamento agendamento = adicionarAgendamentoInterativo();

	    // Criar e retornar o PacoteAventura
	    PacoteAventura pacoteAventura = new PacoteAventura(destinosAventura, hoteisAventura, transportesAventura, agendamento, aventurasList);
	    JOptionPane.showMessageDialog(null, "Pacote de Aventura adicionado com sucesso!");
	    return pacoteAventura;
	}

    // Método para listar informações de um pacote
    public void listarInformacoesPacote(T pacote) {
        StringBuilder informacoes = new StringBuilder("Informações do Pacote:\n");

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


        informacoes.append("Agendamento:\n")
                   .append("Ida: ").append(pacote.getAgendamento().getDataIda()).append("\n")
                   .append("Volta: ").append(pacote.getAgendamento().getDataVolta()).append("\n")
                   .append("Informações: ").append(pacote.getAgendamento().getInformacoes()).append("\n")
                   .append("Checkin: ").append(pacote.getAgendamento().getCheckin()).append("\n")
                   .append("Checkout: ").append(pacote.getAgendamento().getCheckout()).append("\n");

        JOptionPane.showMessageDialog(null, informacoes.toString(), "Informações do Pacote", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void adicionarDestinoInterativo(List<Destino> destinosDisponiveis, List<Destino> destinosParaAdicionar) {
        // Mostra os destinos disponíveis e permite ao usuário decidir se deseja adicionar cada um
        for (Destino destino : destinosDisponiveis) {
            int resposta = JOptionPane.showConfirmDialog(null, "Adicionar destino: " + destino.getNome() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                // Adiciona o destino à lista específica se o usuário escolher sim
                destinosParaAdicionar.add(destino);
            }
        }
    }
    public <T extends Passeio> void adicionarPasseioInterativo(List<T> passeiosDisponiveis, List<T> passeiosParaAdicionar) {
        for (T passeio : passeiosDisponiveis) {
            int resposta = JOptionPane.showConfirmDialog(null, "Adicionar passeio: " + passeio.getNome() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                passeiosParaAdicionar.add(passeio);
            }
        }
    }


    // Método para adicionar guias interativamente a uma lista específica
    public void adicionarGuiaInterativo(List<Guia> guiasDisponiveis, List<Guia> guiasParaAdicionar) {
        for (Guia guia : guiasDisponiveis) {
            int resposta = JOptionPane.showConfirmDialog(null, "Adicionar guia: " + guia.getEspecialidade() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                guiasParaAdicionar.add(guia);
            }
        }
    }

    // Método para adicionar transportes interativamente a uma lista específica
    public void adicionarTransporteInterativo(List<Transporte> transportesDisponiveis, List<Transporte> transportesParaAdicionar) {
        for (Transporte transporte : transportesDisponiveis) {
            int resposta = JOptionPane.showConfirmDialog(null, "Adicionar transporte: " + transporte.getNome() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                transportesParaAdicionar.add(transporte);
            }
        }
    }

    // Método para adicionar hotéis interativamente a uma lista específica
    public void adicionarHotelInterativo(List<Hotel> hoteisDisponiveis, List<Hotel> hoteisParaAdicionar) {
        for (Hotel hotel : hoteisDisponiveis) {
            int resposta = JOptionPane.showConfirmDialog(null, "Adicionar hotel: " + hotel.getNome() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                hoteisParaAdicionar.add(hotel);
            }
        }
    }
    
    public Agendamento adicionarAgendamentoInterativo() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime ida = LocalDateTime.parse(JOptionPane.showInputDialog("Digite a data de início (AAAA-MM-DD HH:mm:ss):"), formatter);
        LocalDateTime volta = LocalDateTime.parse(JOptionPane.showInputDialog("Digite a data de término (AAAA-MM-DD HH:mm:ss):"), formatter);
        String informacoes = JOptionPane.showInputDialog("Digite informações sobre o agendamento:");
        LocalDateTime checkin = LocalDateTime.parse(JOptionPane.showInputDialog("Digite a data de check-in (AAAA-MM-DD HH:mm:ss):"), formatter);
        LocalDateTime checkout = LocalDateTime.parse(JOptionPane.showInputDialog("Digite a data de check-out (AAAA-MM-DD HH:mm:ss):"), formatter);

        Agendamento agendamento = new Agendamento(ida, volta, informacoes, checkin, checkout);
        return agendamento;
    }
    
}
