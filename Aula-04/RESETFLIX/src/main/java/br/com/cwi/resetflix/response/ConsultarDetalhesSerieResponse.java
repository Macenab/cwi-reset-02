package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class ConsultarDetalhesSerieResponse {

    private Long id;
    private String name;
    private Genero genero;
    private Long quantidadeTemporadas;
    private Long quantidadeEpisodios;
    private List<AtoresResponse> atores;

    public ConsultarDetalhesSerieResponse(Long id, String name, Genero genero, Long quantidadeTemporadas,
                                          Long quantidadeEpisodios, List<AtoresResponse> atores) {
        this.id = id;
        this.name = name;
        this.genero = genero;
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEpisodios = quantidadeEpisodios;
        this.atores = atores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Long getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(Long quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public Long getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(Long quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public List<AtoresResponse> getAtores() {
        return atores;
    }

    public void setAtores(List<AtoresResponse> atores) {
        this.atores = atores;
    }
}

