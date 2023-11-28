package main;

import java.time.LocalDate;

import Usuario.model.*;
import Usuario.view.UsuarioView;
import Destino.model.*;
import java.util.*;
import Reserva.model.*;
import Pacotes.model.*;
import Passeio.model.Passeio_Aventura;
import Passeio.model.*;
import Passeio.model.Passeio_Relax;
import java.time.LocalDateTime;


public class main {
    public static void main(String[] args) {
        // Criando algumas listas de exemplo
        List<Reserva<Pacote>> reservas = new ArrayList<>();
        List<Pacote> pacotes = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        List<Destino> destinos = new ArrayList<>();
        List<Guia> guias = new ArrayList<>();
        List<Hotel> hoteis = new ArrayList<>();
        List<Transporte> transportes = new ArrayList<>();
        List<Passeio_Aventura> aventura = new ArrayList<>();
        List<Passeio_Cultura> cultura = new ArrayList<>();
        List<Passeio_Relax> relax = new ArrayList<>();
        
     // Criando uma instância de Sistema com as listas
        Sistema sistema = new Sistema(reservas, pacotes, usuarios, destinos, guias, hoteis, transportes, aventura, cultura, relax);
        
        // Adicionando destinos
        sistema.adicionarDestino(new Destino("Praia Paradise", "Um paraíso tropical com praias deslumbrantes.", CategoriaDestino.PRAIA, "Brasil", "Tangamandapio"));
        sistema.adicionarDestino(new Destino("Aventuras na Chapada", "Explore as belas montanhas e trilhas da Chapada da Diamantina.", CategoriaDestino.MONTANHA, "Brasil", "Chapada da Diamantina"));
        sistema.adicionarDestino(new Destino("Romance em Paris", "A cidade do amor e das luzes.", CategoriaDestino.CIDADE, "França", "Paris"));
        sistema.adicionarDestino(new Destino("Refúgio em Atibaia", "Uma pousada encantadora para relaxar e aproveitar a natureza.", CategoriaDestino.POUSADA, "Brasil", "Atibaia"));
        sistema.adicionarDestino(new Destino("Descobrindo Shangai", "Explore a modernidade e tradição de Shangai.", CategoriaDestino.OUTRA_CATEGORIA, "China", "Shangai"));
        
        // Adicionando usuários à lista de usuários
        sistema.adicionarUsuario(new Turista("Jorge", "123456789", "jorge@email.com", "123456789", LocalDate.of(1990, 1, 1), "jorgeLogin", "jorgeSenha", "Endereço de Jorge"));
        sistema.adicionarUsuario(new Turista("Renata", "987654321", "renata@email.com", "987654321", LocalDate.of(1995, 5, 15), "renataLogin", "renataSenha", "Endereço de Renata"));
        sistema.adicionarUsuario(new Turista("Tadeu", "456789012", "tadeu@email.com", "456789012", LocalDate.of(1985, 10, 20), "tadeuLogin", "tadeuSenha", "Endereço de Tadeu"));
        sistema.adicionarUsuario( new Admin("Bruno", "789012345", "bruno@email.com", "789012345", LocalDate.of(1980, 3, 8), "brunoLogin", "brunoSenha", "CEO"));
        
        // Adiciona Hotel
        Hotel hotel1 = new Hotel("Hotel Praia Paradise", "Rua das Palmeiras, 123", Classificacao.ESTRELA_4, sistema.getDestinos().get(0));
        Hotel hotel2 = new Hotel("Mountain View Hotel", "Av. das Montanhas, 456", Classificacao.ESTRELA_3, sistema.getDestinos().get(1));
        Hotel hotel3 = new Hotel("Romantic Paris Hotel", "Rue de l'Amour, 789", Classificacao.ESTRELA_5, sistema.getDestinos().get(2));
        Hotel hotel4 = new Hotel("Tranquil Pousada", "Rua da Paz, 101", Classificacao.ESTRELA_2, sistema.getDestinos().get(3));
        Hotel hotel5 = new Hotel("Modern Shangai Hotel", "Nanjing Road, 555", Classificacao.ESTRELA_4, sistema.getDestinos().get(4));
        sistema.adicionarHotel(hotel1);
        sistema.adicionarHotel(hotel2);
        sistema.adicionarHotel(hotel3);
        sistema.adicionarHotel(hotel4);
        sistema.adicionarHotel(hotel5);
        
        // Adiciona guia
        Guia guia1 = new Guia("Carmen San Diego", "12345678901", "guiaA@email.com", "123456789", LocalDate.of(1990, 1, 1), "História");
        Guia guia2 = new Guia("Wally", "98765432101", "guiaB@email.com", "987654321", LocalDate.of(1985, 5, 5), "Aventura");
        sistema.adicionarGuia(guia1);
        sistema.adicionarGuia(guia2);
        
        // Adiciona transportes 
        Transporte transporte1 = new Transporte("Aeroporto Shuttle", "Aeroporto Internacional", TipoTransporte.AEROPORTO, sistema.getDestinos().get(0));
        Transporte transporte2 = new Transporte("Porto Express", "Porto da Cidade", TipoTransporte.PORTO, sistema.getDestinos().get(1));
        Transporte transporte3 = new Transporte("Ônibus Turístico", "Rodoviária Central", TipoTransporte.RODOVIARIA, sistema.getDestinos().get(2));
        Transporte transporte4 = new Transporte("Táxi Pousada", "Pousada Area", TipoTransporte.AEROPORTO, sistema.getDestinos().get(3));
        Transporte transporte5 = new Transporte("Maglev Train", "Estação Central", TipoTransporte.AEROPORTO, sistema.getDestinos().get(4));

        // Adicione transportes usando o método da classe Sistema
        sistema.adicionarTransporte(transporte1);
        sistema.adicionarTransporte(transporte2);
        sistema.adicionarTransporte(transporte3);
        sistema.adicionarTransporte(transporte4);
        sistema.adicionarTransporte(transporte5);
        
        // Adiciona passeios cultura
        Passeio_Cultura passeioCultura1 = new Passeio_Cultura("Museu de Arte Moderna", "Rua das Artes, 123", 50.0, sistema.getDestinos().get(0), 2, "Exposições de arte moderna", Tipo_Cultura.MUSEU);
        Passeio_Cultura passeioCultura2 = new Passeio_Cultura("Teatro Municipal", "Avenida Principal, 456", 40.0, sistema.getDestinos().get(1), 3, "Espetáculo de ópera", Tipo_Cultura.TEATRO);
        sistema.adicionarCultura(passeioCultura1);
        sistema.adicionarCultura(passeioCultura2);
        
        // Adiciona passeios aventura
        Passeio_Aventura passeioAventura1 = new Passeio_Aventura("Trilha na Montanha da torre eiffel", "Trilha da Aventura, 123", 80.0, sistema.getDestinos().get(2), 4, "18-40", "Levar equipamento de segurança");
        Passeio_Aventura passeioAventura2 = new Passeio_Aventura("Rafting no Rio Atibaia", "Rio Aventura, 456", 65.0, sistema.getDestinos().get(3), 3, "16-50", "Saber nadar");
        sistema.adicionarAventura(passeioAventura1);
        sistema.adicionarAventura(passeioAventura2);
        
        
        // Adiciona passeios relax
        Passeio_Relax passeioRelax = new Passeio_Relax("Spa Tranquilo", "Rua da Serenidade, 789", 120.0, sistema.getDestinos().get(4), 2, "Yoga e Massagens");
        sistema.adicionarRelax(passeioRelax);
        
        // Cria os pacotes de cultura
        Agendamento agendamento1 = new Agendamento(LocalDateTime.now(), LocalDateTime.now().plusDays(7), "Informações Pacote 1",
                LocalDateTime.now(), LocalDateTime.now().plusDays(10));

        Agendamento agendamento2 = new Agendamento(LocalDateTime.now(), LocalDateTime.now().plusDays(10), "Informações Pacote 2",
                LocalDateTime.now(), LocalDateTime.now().plusDays(12));
        
        PacoteCultura pacoteCultura1 = new PacoteCultura(
                Arrays.asList(sistema.getDestinos().get(0)),  // Lista de destinos (cidade 1)
                Arrays.asList(hotel1),
                Arrays.asList(transporte2),
                agendamento1,  // Agendamento
                Arrays.asList(guia1),  // Lista de guias
                Arrays.asList(passeioCultura1)
        );

        PacoteCultura pacoteCultura2 = new PacoteCultura(
                Arrays.asList(sistema.getDestinos().get(1)),  // Lista de destinos (cidade 2)
                Arrays.asList(hotel2),
                Arrays.asList(transporte2),
                agendamento2,  // Agendamento
                Arrays.asList(guia2),  // Lista de guias
                Arrays.asList(passeioCultura2)
        );

        // Adiciona os pacotes de cultura usando o método da classe Sistema
        sistema.adicionarPacoteCult(pacoteCultura1);
        sistema.adicionarPacoteCult(pacoteCultura2);
        
        
        // Adiciona pacote aventura
        Agendamento agendamentoAventura1 = new Agendamento(LocalDateTime.now(), LocalDateTime.now().plusDays(5), "Detalhes do agendamento 1", LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        Agendamento agendamentoAventura2 = new Agendamento(LocalDateTime.now(), LocalDateTime.now().plusDays(7), "Detalhes do agendamento 2", LocalDateTime.now(), LocalDateTime.now().plusDays(12));
        PacoteAventura pacoteAventura1 = new PacoteAventura(
                Arrays.asList(sistema.getDestinos().get(2)),  // Lista de destinos (cidade 3)
                Arrays.asList(hotel3),
                Arrays.asList(transporte3),
                agendamentoAventura1,  // Agendamento
                Arrays.asList(passeioAventura1)
        );

        PacoteAventura pacoteAventura2 = new PacoteAventura(
                Arrays.asList(sistema.getDestinos().get(3)),  // Lista de destinos (cidade 4)
                Arrays.asList(hotel4),
                Arrays.asList(transporte4),
                agendamentoAventura2,  // Agendamento
                Arrays.asList(passeioAventura2)
        );

        // Adicionando pacotes de aventura ao sistema
        sistema.adicionarPacoteAvent(pacoteAventura1);
        sistema.adicionarPacoteAvent(pacoteAventura2);
        
        // Adiciona pacote relax
        Agendamento agendamentoRelax1 = new Agendamento(LocalDateTime.now(), LocalDateTime.now().plusDays(3), "Detalhes do agendamento 3", LocalDateTime.now(), LocalDateTime.now().plusDays(5));
        
        // Criando pacotes de relaxamento
        PacoteRelax pacoteRelax1 = new PacoteRelax(
                Arrays.asList(sistema.getDestinos().get(4)),  // Lista de destinos (cidade 5)
                Arrays.asList(hotel5),
                Arrays.asList(transporte5),
                agendamentoRelax1,  // Agendamento
                Arrays.asList(passeioRelax)
        );
        sistema.adicionarPacoteRelax(pacoteRelax1);
        
        
        // Rodando o sistema
        sistema.rodarSistema();
    }
}
/*
	// Exemplo de uso com um Turista
    Turista turista = new Turista("João", "123.456.789-00", "joao@email.com", "123456789", LocalDate.of(1990, 5, 20), "joao123", "senha123", "Rua Principal, 123");
    UsuarioView<Turista> turistaView = new UsuarioView<>();
    turistaView.fazerLogin(turista);
    turistaView.exibirInformacoes(turista);

    // Exemplo de uso com um Admin
    Admin admin = new Admin("Admin", "987.654.321-00", "admin@email.com", "987654321", LocalDate.of(1980, 10, 15), "admin123", "senha456", "Gerente de Conteúdo");
    turistaView.fazerLogin(admin);
    turistaView.exibirInformacoes(admin);
    turistaView.adicionarAdmin();  // Adiciona um novo Admin e exibe informações
}
}*/