package Usuario.view;

import javax.swing.*;
import Usuario.model.*;
import java.time.*;

public class UsuarioView<T extends Usuario> {

    // Método para realizar o login
    public void fazerLogin(Usuario usuario) {
        String login = JOptionPane.showInputDialog("Digite o login:");
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        // Verifica se o login e senha correspondem ao usuário
        if (usuario.getLogin().equals(login) && usuario.getPassword().equals(senha)) {
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
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");
        String email = JOptionPane.showInputDialog("Digite o email:");
        String contato = JOptionPane.showInputDialog("Digite o contato:");
        LocalDate dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento (AAAA-MM-DD):"));
        String login = JOptionPane.showInputDialog("Digite o login:");
        String password = JOptionPane.showInputDialog("Digite a senha:");
        String cargo = JOptionPane.showInputDialog("Digite o cargo:");

        Admin admin = new Admin(nome, cpf, email, contato, dataNascimento, login, password, cargo);
        return admin;  // Adiciona o novo Admin à lista
    }

    // Método para adicionar um novo usuário do tipo Turista
    public Turista adicionarTurista() {
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
    }

}

