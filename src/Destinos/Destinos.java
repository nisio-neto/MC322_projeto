
// Pacote Destino
package Destinos;

// Classe Destino para representar informações sobre destinos de viagem
public class Destinos {
    private String nome;
    private String descricao;
    private CategoriaDestino categoria;
    private String pais;
    private String cidade;

    // Construtor para inicializar objetos Destino com informações relevantes
    public Destinos(String nome, String descricao, CategoriaDestino categoria, String pais, String cidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.pais = pais;
        this.cidade = cidade;
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

    // Um enum para representar Categorias de Destino
	public enum CategoriaDestino {
	    PRAIA,
	    MONTANHA,
	    CIDADE,
	    POUSADA,
	    FAZENDA,
	    OUTRA_CATEGORIA
	}

}