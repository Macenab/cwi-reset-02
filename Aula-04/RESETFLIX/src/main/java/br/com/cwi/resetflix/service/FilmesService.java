package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmesResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {

    @Autowired
    public FilmeRepository filmeRepository;

//    @Autowired
//    private AtoresRepository atoresRepository;
//
//    @Autowired
//    private DiretorRepository diretorRepository;

    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    public ConsultarDetalhesFilmesResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmesResponseMapper();

    public List<FilmeResponse> getFilmes(){
        List<FilmeEntity> filmes = filmeRepository.getFilmes();
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request){
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmeRepository.criarFilme(filmeSalvar);
    }

    public ConsultarDetalhesFilmeResponse getFilmeById(final Long id){
        FilmeEntity filmeSalvo =  filmeRepository.getFilmesById(id);
        DiretoresResponse diretorSalvo = new DiretoresResponse(id, filmeSalvo.getNome());
        List<AtoresResponse> atorSalvos = new ArrayList<>();
        return MAPPER_DETALHES_FILME.mapear(filmeSalvo, diretorSalvo, atorSalvos);
    }
}
