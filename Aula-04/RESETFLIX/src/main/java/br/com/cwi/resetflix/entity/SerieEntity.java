package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class SerieEntity {

    private Long id;
    private String nome;
    private Genero genero;
    private List<Long> idsAtores;
    private Long episodios;
    private Long temporadas;

    public SerieEntity(Long id, String nome, Genero genero, List<Long> idsAtores, Long episodios, Long temporadas) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idsAtores = idsAtores;
        this.episodios = episodios;
        this.temporadas = temporadas;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }

    public Long getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Long episodios) {
        this.episodios = episodios;
    }

    public Long getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Long temporadas) {
        this.temporadas = temporadas;
    }
}
