package br.com.cwi.resetflix.entity;

import java.util.List;

public class DiretorEntity {

    private Long id;
    private String name;
    private List<Long> idsFilmes;

    public DiretorEntity(final String name, final List<Long> idsFilmes) {
        this.name = name;
        this.idsFilmes = idsFilmes;
    }

    public DiretorEntity(final Long id, String name, final List<Long> idsFilmes) {
        this.id = id;
        this.name = name;
        this.idsFilmes = idsFilmes;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Long> getIdsFilmes() {
        return idsFilmes;
    }

    public void setIdsFilmes(List<Long> idsFilmes) {
        this.idsFilmes = idsFilmes;
    }
}
