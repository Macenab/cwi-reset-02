package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesSerieResponseMapper;
import br.com.cwi.resetflix.mapper.SerieEntityMapper;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.repository.SerieRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    public SerieRepository serieRepository;

    static SerieResponseMapper MAPPER_RESPONSE = new SerieResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY = new SerieEntityMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIE = new ConsultarDetalhesSerieResponseMapper();

    public List<SerieResponse> getSeries(){
        List<SerieEntity> series = serieRepository.getSeries();
        return MAPPER_RESPONSE.mapear(series);
    }

    public Long criarSerie(final CriarSerieRequest request){
        SerieEntity seriesSalvar = MAPPER_ENTITY.mapear(request);
        return serieRepository.criarSerie(seriesSalvar);
    }

    public ConsultarDetalhesSerieResponse getSerieById(final Long id){
        SerieEntity serieSalva = serieRepository.getSerieById(id);
        return null;
    }
}
