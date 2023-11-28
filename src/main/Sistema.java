package main;

import javax.swing.JOptionPane;
import Destino.model.Destino;
import Pacotes.model.*;
import Passeio.model.*;
import Pacotes.model.*;
import Reserva.model.*;
import Usuario.model.*;
import java.util.*;
import Destino.view.*;
import Pacotes.view.*;
import Reserva.view.*;
import Usuario.view.UsuarioView;

import java.util.List;

public class Sistema {

    private List<Reserva<Pacote>> reservas;
    private List<Pacote> pacotes;
    private List<Usuario> usuarios;
    private List<Destino> destinos;
    private List<Guia> guias;
    private List<Hotel> hoteis;
    private List<Transporte> transportes;
    private List<Passeio_Aventura> aventura;
    private List<Passeio_Cultura> cultura;
    private List<Passeio_Relax> relax;

    private DestinoView destinoView;
    private PacoteView<Pacote> pacoteView;
    private ReservaView<Pacote> reservaView;
    private UsuarioView<Usuario> usuarioView;

    public Sistema(List<Reserva<Pacote>> reservas, List<Pacote> pacotes, List<Usuario> usuarios, List<Destino> destinos, List<Guia> guias, List<Hotel> hoteis, List<Transporte> transportes, List<Passeio_Aventura> aventura, List<Passeio_Cultura> cultura, List<Passeio_Relax> relax ) {
        this.reservas = reservas;
        this.pacotes = pacotes;
        this.usuarios = usuarios;
        this.destinos = destinos;
        this.aventura = aventura;
        this.cultura = cultura;
        this.relax = relax;
        this.hoteis = hoteis;
        this.guias = guias;
        this.transportes = transportes;

        this.destinoView = new DestinoView();
        this.pacoteView = new PacoteView<>();
        this.reservaView = new ReservaView<>();
        this.usuarioView = new UsuarioView<>();
    }

    public void rodarSistema() {
        while (true) {
            int escolha = exibirMenuInicial();

            switch (escolha) {
                case 1:
                    fazerLoginComoAdmin();
                    rodarSistemaAdmin();
                    break;
                case 2:
                    fazerLoginComoUsuario();
                    rodarSistemaUsuario();
                    break;
                case 3:
                    cadastrarNovoUsuario();
                    break;
                case 4:
                    // Opção para sair do sistema
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private int exibirMenuInicial() {
        String[] opcoes = {"Fazer login como admin", "Fazer login como usuario", "Cadastrar novo usuario", "Sair do sistema"};
        return ExibirOpcoes(opcoes);
    }

    private int ExibirOpcoes(String[] opcoes){
        return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Inicial", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) + 1;
    }

    private void fazerLoginComoAdmin() {
        usuarioView.fazerLogin(usuarios);
    }

    private void fazerLoginComoUsuario() {
    	usuarioView.fazerLogin(usuarios);
    }

    private void cadastrarNovoUsuario() {
          cadastrarNovoTurista();
    }

    private void cadastrarNovoAdmin() {
    	usuarios.add(usuarioView.adicionarAdmin());
    }

    private void cadastrarNovoTurista() {
    	usuarios.add(usuarioView.adicionarTurista());
    }
    public void adicionarDestino(Destino destino) {
        destinos.add(destino);
    }
    public void adicionarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }
    public void adicionarGuia(Guia guia) {
        guias.add(guia);
    }
    public void adicionarTransporte(Transporte transporte) {
        transportes.add(transporte);
    }
    public void adicionarCultura(Passeio_Cultura cultural) {
        cultura.add(cultural);
    }
    public void adicionarAventura(Passeio_Aventura cultural) {
        aventura.add(cultural);
    }
    public void adicionarRelax(Passeio_Relax cultural) {
        relax.add(cultural);
    }
    public void adicionarPacoteCult(PacoteCultura cultural) {
        pacotes.add(cultural);
    }
    public void adicionarPacoteAvent(PacoteAventura cultural) {
        pacotes.add(cultural);
    }
    public void adicionarPacoteRelax(PacoteRelax cultural) {
        pacotes.add(cultural);
    }
    public void adicionarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        } else {
            System.out.println("Erro ao adicionar usuário. Usuário nulo.");
        }
    }
    
    public void rodarSistemaAdmin() {
        while (true) {
            int escolhaAdmin = exibirMenuAdmin();

            switch (escolhaAdmin) {
                case 1:
                    adicionarDestinoI();
                    break;
                case 2:
                    adicionarPacoteI();
                    break;
                case 3:
                    adicionarAdminI();
                    break;
                case 4:
                    adicionarHotelI();
                    break;
                case 5:
                    adicionarPasseioI();
                    break;
                case 6:
                    adicionarGuiaI();
                    break;
                case 7:
                    adicionarAgendamentoI();
                    break;
                case 8:
                    adicionarTransporteI();
                    break;
                case 9:
                    // Opção para sair do sistema administrador
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private int exibirMenuAdmin() {
        String[] opcoesAdmin = {
            "Adicionar Destino",
            "Adicionar Pacote",
            "Adicionar Admin",
            "Adicionar Hotel",
            "Adicionar Passeio",
            "Adicionar Guia",
            "Adicionar Agendamento",
            "Adicionar Transporte",
            "Sair do sistema administrador"
        };
        return ExibirOpcoes(opcoesAdmin);
    }

    private void adicionarDestinoI() {
        // Crie um novo destino (você pode adicionar lógica para obter informações do usuário)
        destinos.add(destinoView.criarDestinoInterativo());
    }

    private void adicionarPacoteI() {
        // Crie um novo pacote (você pode adicionar lógica para obter informações do usuário)
    	String[] opcoesPacote = {"Pacote Aventura", "Pacote Relax", "Pacote Cultura"};
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pacote:", "Adicionar Pacote", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoesPacote, opcoesPacote[0]);

        switch (escolha) {
            case 0:
                adicionarPacoteAventuraI();
                break;
            case 1:
                adicionarPacoteRelaxI();
                break;
            case 2:
                adicionarPacoteCulturaI();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private void adicionarPacoteAventuraI() {
        PacoteAventura pacote = pacoteView.adicionarPacoteAventura(destinos, guias, hoteis, transportes, aventura);
        pacotes.add(pacote);
        JOptionPane.showMessageDialog(null, "Pacote de Aventura adicionado com sucesso!");
    }

    private void adicionarPacoteRelaxI() {
        PacoteRelax pacote = pacoteView.adicionarPacoteRelax(destinos, guias, hoteis, transportes, relax);
        pacotes.add(pacote);
        JOptionPane.showMessageDialog(null, "Pacote Relax adicionado com sucesso!");
    }

    private void adicionarPacoteCulturaI() {
        PacoteCultura pacote = pacoteView.adicionarPacoteCultura(destinos, guias, hoteis, transportes, cultura);
        pacotes.add(pacote);
        JOptionPane.showMessageDialog(null, "Pacote Cultura adicionado com sucesso!");
    }

    private void adicionarAdminI() {
        // Crie um novo admin (você pode adicionar lógica para obter informações do usuário)
        cadastrarNovoAdmin();
    }

    private void adicionarHotelI() {
        // Crie um novo hotel (você pode adicionar lógica para obter informações do usuário)
        // Adicione o hotel à lista de hoteis
        // ...
    }

    private void adicionarPasseioI() {
        // Crie um novo passeio (você pode adicionar lógica para obter informações do usuário)
        // Adicione o passeio à lista de passeios
        // ...
    }

    private void adicionarGuiaI() {
        // Crie um novo guia (você pode adicionar lógica para obter informações do usuário)
        // Adicione o guia à lista de guias
        // ...
    }

    private void adicionarAgendamentoI() {
        // Crie um novo agendamento (você pode adicionar lógica para obter informações do usuário)
        // Adicione o agendamento à lista de agendamentos
        // ...
    }

    private void adicionarTransporteI() {
        // Crie um novo transporte (você pode adicionar lógica para obter informações do usuário)
        // Adicione o transporte à lista de transportes
        // ...
    }
    
    public List<Destino> getDestinos() {
        return destinos;
    }
}

