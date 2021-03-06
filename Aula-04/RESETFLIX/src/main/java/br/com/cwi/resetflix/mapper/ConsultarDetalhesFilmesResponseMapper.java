package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

import java.util.List;

public class ConsultarDetalhesFilmesResponseMapper {

    public ConsultarDetalhesFilmeResponse mapear(final FilmeEntity filmeSalvo,final DiretoresResponse diretoresResponse,
                                                 List<AtoresResponse> atoresResponse){
        return new ConsultarDetalhesFilmeResponse(filmeSalvo.getId(), filmeSalvo.getNome(), filmeSalvo.getGenero(),
                diretoresResponse, atoresResponse);
    }

}
