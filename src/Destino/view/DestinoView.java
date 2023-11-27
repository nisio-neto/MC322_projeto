package Destino.view;

import Destino.model.Destino;

// Classe para exibir informações sobre um destino
public class DestinoView {
    // Método para exibir detalhes sobre o destino
    public void mostrarDetalhesDestino(Destino destino) {
        System.out.println("Detalhes do Destino:");
        System.out.println("Nome: " + destino.getNome());
        System.out.println("Descrição: " + destino.getDescricao());
        System.out.println("Categoria: " + destino.getCategoria());
        System.out.println("País: " + destino.getPais());
        System.out.println("Cidade: " + destino.getCidade());

        // Exibindo informações sobre hotéis associados ao destino
        System.out.println("Hotéis Associados:");
        destino.getHoteis().forEach(hotel -> System.out.println("- " + hotel.getNome()));

        // Exibindo informações sobre transportes associados ao destino
        System.out.println("Transportes Associados:");
        destino.getTransportes().forEach(transporte -> System.out.println("- " + transporte.getNome()));

        System.out.println();  // Adiciona uma linha em branco para separar os destinos ao imprimir vários
    }
}
