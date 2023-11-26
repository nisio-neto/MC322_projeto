package Passeio.model;

import Destino.model.Destino;

public class Passeio_Aventura extends Passeio {
    private String faixaEtaria;
    private String precaucoes;

    // Construtor
    public Passeio_Aventura(String nome, String local, double valor, Destino destino, int duracao,
                    String faixaEtaria, String precaucoes) {
        super(nome, local, valor, destino, duracao);
        this.faixaEtaria = faixaEtaria;
        this.precaucoes = precaucoes;
    }

    // Getters e setters específicos para a classe Aventura
    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getPrecaucoes() {
        return precaucoes;
    }

    public void setPrecaucoes(String precaucoes) {
        this.precaucoes = precaucoes;
    }
}