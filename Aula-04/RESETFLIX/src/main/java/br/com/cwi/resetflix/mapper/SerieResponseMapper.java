package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.ArrayList;
import java.util.List;

public class SerieResponseMapper {

    public List<SerieResponse> mapear(final List<SerieEntity> series){
        List<SerieResponse> serieResponses = new ArrayList<>();

        for(SerieEntity serieEntity : series){

            SerieResponse serieResponse = new SerieResponse(serieEntity.getId(), serieEntity.getNome(),
                    serieEntity.getGenero());

            serieResponses.add(serieResponse);

        }
        return serieResponses;
    }
}
