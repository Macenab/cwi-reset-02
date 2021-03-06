package br.com.cwi.resetflix.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIds = 1l;

    public List<FilmeEntity> getFilmes() {
        return filmes;
    }

    public Long criarFilme(final FilmeEntity filmeSalvar){
        if(filmeSalvar.getId() == null) {
            filmeSalvar.setId(contadorIds);
            contadorIds++;
        }
        filmes.add(filmeSalvar);
        return filmeSalvar.getId();
    }

    public FilmeEntity getFilmesById(final Long id){

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getId().equals(id)){
                return filmeEntity;
            }
        }
        return null;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator

        for (FilmeEntity filmeEntity : filmes) {
            if (filmeEntity.getIdsAtores().equals(id)) {
                return (List<FilmeEntity>) filmeEntity;
            }
        }
        return acharFilmesAtor(id);
    }

    public List<FilmeEntity> acharFilmesDiretor(final Long id) {
        //TODO Filtrar na repository por id de ator

        for (FilmeEntity filmeEntity : filmes) {
            if (filmeEntity.getIdsAtores().equals(id)) {
                return filmes;
            }
        }
        return acharFilmesDiretor(id);
    }
}
