package br.com.cwi.resetflix.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.FilmeResponse;

public class FilmeResponseMapper {

    public List<FilmeResponse> mapear(final List<FilmeEntity> filmes) {
        List<FilmeResponse> filmeResponses = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmes){

             FilmeResponse filmeResponse = new FilmeResponse(filmeEntity.getId(),
                filmeEntity.getNome(), filmeEntity.getGenero());

             filmeResponses.add(filmeResponse);

        }
        return filmeResponses;
    }
}
