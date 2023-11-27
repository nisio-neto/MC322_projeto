package main;

import java.time.LocalDate;

import Usuario.model.Admin;
import Usuario.model.Turista;
import Usuario.view.UsuarioView;

public class main{
public static void main(String[] args) {
	// Exemplo de uso com um Turista
    Turista turista = new Turista("João", "123.456.789-00", "joao@email.com", "123456789", LocalDate.of(1990, 5, 20), "joao123", "senha123", "Rua Principal, 123");
    UsuarioView<Turista> turistaView = new UsuarioView<>();
    turistaView.fazerLogin(turista);
    turistaView.exibirInformacoes(turista);

    // Exemplo de uso com um Admin
    Admin admin = new Admin("Admin", "987.654.321-00", "admin@email.com", "987654321", LocalDate.of(1980, 10, 15), "admin123", "senha456", "Gerente de Conteúdo");
    UsuarioView<Admin> adminView = new UsuarioView<>();
    adminView.fazerLogin(admin);
    adminView.exibirInformacoes(admin);
    adminView.adicionarAdmin();  // Adiciona um novo Admin e exibe informações
}
}