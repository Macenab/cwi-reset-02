package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {

    public ConsultarDetalhesSerieResponse mapear(final SerieEntity serieSalva, List<AtoresResponse> atoresResponses) {
        return new ConsultarDetalhesSerieResponse(serieSalva.getId(), serieSalva.getNome(), serieSalva.getGenero(),
                serieSalva.getTemporadas(), serieSalva.getEpisodios(), atoresResponses);
    }
}
