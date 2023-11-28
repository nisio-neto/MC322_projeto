package Usuario.view;

import javax.swing.*;
import Usuario.model.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class UsuarioView<T extends Usuario> {

    // Método para realizar o login
	public void fazerLogin(List<Usuario> usuarios) {
        String login = JOptionPane.showInputDialog("Digite o login:");
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        boolean loginBemSucedido = false;

        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getPassword().equals(senha)) {
                loginBemSucedido = true;
                break;
            }
        }

        if (loginBemSucedido) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
        } else {
            JOptionPane.showMessageDialog(null, "Login falhou. Verifique suas credenciais.");
        }
    }

    // Método para exibir informações do usuário
    public void exibirInformacoes(Usuario usuario) {
        String informacoes = "Nome: " + usuario.getNome() + "\n" +
                             "CPF: " + usuario.getCpf() + "\n" +
                             "Email: " + usuario.getEmail() + "\n" +
                             "Contato: " + usuario.getContato() + "\n" +
                             "Data de Nascimento: " + usuario.getDataNascimento() + "\n";

        JOptionPane.showMessageDialog(null, informacoes, "Informações do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Usuario adicionarAdmin() {
        try {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            String email = JOptionPane.showInputDialog("Digite o email:");
            String contato = JOptionPane.showInputDialog("Digite o contato:");
            LocalDate dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento (AAAA-MM-DD):"));
            String login = JOptionPane.showInputDialog("Digite o login:");
            String password = JOptionPane.showInputDialog("Digite a senha:");
            String cargo = JOptionPane.showInputDialog("Digite o cargo:");

            Admin admin = new Admin(nome, cpf, email, contato, dataNascimento, login, password, cargo);
            JOptionPane.showMessageDialog(null, "Admin adicionado com sucesso");
            return admin;  // Adiciona o novo Admin à lista
        } catch (DateTimeParseException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar Admin. Verifique os dados inseridos.");
            return null;  // Retorna null se houver erro
        }
    }

    // Método para adicionar um novo usuário do tipo Turista
    public Turista adicionarTurista() {
        try {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            String email = JOptionPane.showInputDialog("Digite o email:");
            String contato = JOptionPane.showInputDialog("Digite o contato:");
            LocalDate dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento (AAAA-MM-DD):"));
            String login = JOptionPane.showInputDialog("Digite o login:");
            String password = JOptionPane.showInputDialog("Digite a senha:");
            String endereco = JOptionPane.showInputDialog("Digite o endereço:");

            Turista turista = new Turista(nome, cpf, email, contato, dataNascimento, login, password, endereco);
            return turista;  // Adiciona o novo Turista à lista
        } catch (DateTimeParseException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar Turista. Verifique os dados inseridos.");
            return null;  // Retorna null se houver erro
        }
    }
}

