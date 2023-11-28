package main;

import java.time.LocalDate;

import Usuario.model.*;
import Usuario.view.UsuarioView;
import Destino.model.*;
import java.util.*;
import Reserva.model.*;
import Pacotes.model.*;
import Passeio.model.Passeio_Aventura;
import Passeio.model.Passeio_Cultura;
import Passeio.model.Passeio_Relax;


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
        
        // Adiciona hotel
        sistema.adicionarHotel(new Hotel("Hotel Praia Paradise", "Rua das Palmeiras, 123", Classificacao.ESTRELA_4, sistema.getDestinos().get(0)));
        sistema.adicionarHotel(new Hotel("Mountain View Hotel", "Av. das Montanhas, 456", Classificacao.ESTRELA_3, sistema.getDestinos().get(1)));
        sistema.adicionarHotel(new Hotel("Romantic Paris Hotel", "Rue de l'Amour, 789", Classificacao.ESTRELA_5, sistema.getDestinos().get(2)));
        sistema.adicionarHotel(new Hotel("Tranquil Pousada", "Rua da Paz, 101", Classificacao.ESTRELA_2, sistema.getDestinos().get(3)));
        sistema.adicionarHotel(new Hotel("Modern Shangai Hotel", "Nanjing Road, 555", Classificacao.ESTRELA_4, sistema.getDestinos().get(4)));
        
        // Adiciona guia
        Guia guia1 = new Guia("Carmen San Diego", "12345678901", "guiaA@email.com", "123456789", LocalDate.of(1990, 1, 1), "História");
        Guia guia2 = new Guia("Wally", "98765432101", "guiaB@email.com", "987654321", LocalDate.of(1985, 5, 5), "Aventura");
        sistema.adicionarGuia(guia1);
        sistema.adicionarGuia(guia2);
        
        
        
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