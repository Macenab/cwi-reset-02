package br.com.cwi.resetflix.response;

import java.util.List;

public class ConsultarDetalhesDiretorResponse {

    private Long id;
    private String name;
    private List<FilmeResponse> filmes;

    public ConsultarDetalhesDiretorResponse(Long id, String name, List<FilmeResponse> filmes) {
        this.id = id;
        this.name = name;
        this.filmes = filmes;
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

    public List<FilmeResponse> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmeResponse> filmes) {
        this.filmes = filmes;
    }
}
