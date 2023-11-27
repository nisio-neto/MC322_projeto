package Destino.view;

import Destino.model.Destino;
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
}
