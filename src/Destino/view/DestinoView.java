package Destino.view;

import Destino.model.*;
import javax.swing.JOptionPane;

// Classe para exibir informações sobre um destino
public class DestinoView {
    // Método para exibir detalhes sobre o destino
    public void mostrarDetalhesDestino(Destino destino) {
        try {
            StringBuilder detalhes = new StringBuilder("Detalhes do Destino:\n");
            detalhes.append("Nome: ").append(destino.getNome()).append("\n");
            detalhes.append("Descrição: ").append(destino.getDescricao()).append("\n");
            detalhes.append("Categoria: ").append(destino.getCategoria()).append("\n");
            detalhes.append("País: ").append(destino.getPais()).append("\n");
            detalhes.append("Cidade: ").append(destino.getCidade()).append("\n\n");

            // Exibindo informações sobre hotéis associados ao destino
            detalhes.append("Hotéis Associados:\n");
            destino.getHoteis().forEach(hotel -> detalhes.append("- ").append(hotel.getNome()).append("\n"));

            // Exibindo informações sobre transportes associados ao destino
            detalhes.append("\nTransportes Associados:\n");
            destino.getTransportes().forEach(transporte -> detalhes.append("- ").append(transporte.getNome()).append("\n"));

            // Exibir as informações usando JOptionPane
            JOptionPane.showMessageDialog(null, detalhes.toString(), "Detalhes do Destino", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao exibir os detalhes do destino: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public Destino criarDestinoInterativo() {
        String nome = JOptionPane.showInputDialog("Digite o nome do destino:");
        String descricao = JOptionPane.showInputDialog("Digite a descrição do destino:");
        CategoriaDestino categoria = escolherCategoriaDestino();
        String pais = JOptionPane.showInputDialog("Digite o país do destino:");
        String cidade = JOptionPane.showInputDialog("Digite a cidade do destino:");

        return new Destino(nome, descricao, categoria, pais, cidade);
    }

    private CategoriaDestino escolherCategoriaDestino() {
        String[] opcoes = {
            "Praia",
            "Montanha",
            "Cidade",
            "Pousada",
            "Fazenda",
            "Outra Categoria"
        };

        int escolha = JOptionPane.showOptionDialog(null, "Escolha a categoria do destino:", "Categoria do Destino", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                return CategoriaDestino.PRAIA;
            case 1:
                return CategoriaDestino.MONTANHA;
            case 2:
                return CategoriaDestino.CIDADE;
            case 3:
                return CategoriaDestino.POUSADA;
            case 4:
                return CategoriaDestino.FAZENDA;
            case 5:
                return CategoriaDestino.OUTRA_CATEGORIA;
            default:
                return CategoriaDestino.OUTRA_CATEGORIA;
        }
    }
    
}
