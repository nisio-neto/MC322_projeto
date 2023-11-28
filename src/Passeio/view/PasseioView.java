package Passeio.view;

import Passeio.model.Passeio;
import Passeio.model.Passeio_Aventura;
import Passeio.model.Passeio_Cultura;
import Passeio.model.Passeio_Relax;
import javax.swing.JOptionPane;

// Classe para exibir informações sobre um passeio
public class PasseioView {

    // Método para exibir detalhes sobre o passeio
    public void mostrarDetalhesPasseio(Passeio passeio) {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Detalhes do Passeio:\n");
        mensagem.append("Nome: ").append(passeio.getNome()).append("\n");
        mensagem.append("Local: ").append(passeio.getLocal()).append("\n");
        mensagem.append("Valor: ").append(passeio.getValor()).append("\n");
        mensagem.append("Destino: ").append(passeio.getDestino().getNome()).append("\n");
        mensagem.append("Duração: ").append(passeio.getDuracao()).append(" horas\n");

        // Adicionar informações específicas do tipo de passeio
        if (passeio instanceof Passeio_Relax) {
            mensagem.append("Medicações: ").append(((Passeio_Relax) passeio).getMediacoes()).append("\n");
        } else if (passeio instanceof Passeio_Cultura) {
            mensagem.append("Atrações: ").append(((Passeio_Cultura) passeio).getAtracoes()).append("\n");
            mensagem.append("Tipo de Cultura: ").append(((Passeio_Cultura) passeio).getTipoCultura()).append("\n");
        } else if (passeio instanceof Passeio_Aventura) {
            mensagem.append("Faixa Etária: ").append(((Passeio_Aventura) passeio).getFaixaEtaria()).append("\n");
            mensagem.append("Precauções: ").append(((Passeio_Aventura) passeio).getPrecaucoes()).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString(), "Detalhes do Passeio", JOptionPane.INFORMATION_MESSAGE);
    }
}
