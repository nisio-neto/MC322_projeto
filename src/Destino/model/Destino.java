package Destino.model;

import java.util.ArrayList;
import java.util.List;
import Pacotes.model.Hotel;
import Pacotes.model.Transporte;

public class Destino {
    private String nome;
    private String descricao;
    private CategoriaDestino categoria;
    private String pais;
    private String cidade;
    private List<Hotel> hoteis;
    private List<Transporte> transportes;

    // Construtor para inicializar objetos Destino com informações relevantes
    public Destino(String nome, String descricao, CategoriaDestino categoria, String pais, String cidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.pais = pais;
        this.cidade = cidade;
        this.hoteis = new ArrayList<>();
        this.transportes = new ArrayList<>();
    }

    // Métodos getters para acessar as informações do destino
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public CategoriaDestino getCategoria() {
        return categoria;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    // Métodos para adicionar e obter hotéis associados ao destino
    public void adicionarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    // Métodos para adicionar e obter transportes associados ao destino
    public void adicionarTransporte(Transporte transporte) {
        transportes.add(transporte);
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }
}
