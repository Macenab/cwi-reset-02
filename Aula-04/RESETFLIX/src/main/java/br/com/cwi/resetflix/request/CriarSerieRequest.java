package br.com.cwi.resetflix.request;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class CriarSerieRequest {

    private Long id;
    private String nome;
    private Long quantidadeTemporadas;
    private Long quantidadeEpisodios;
    private List<Long> idAtores;
    private Genero genero;

    public CriarSerieRequest(Long id, String nome, Long quantidadeTemporadas, Long quantidadeEpisodios, List<Long> idAtores, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEpisodios = quantidadeEpisodios;
        this.idAtores = idAtores;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Long> getIdAtores() {
        return idAtores;
    }

    public void setIdAtores(List<Long> idAtores) {
        this.idAtores = idAtores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
