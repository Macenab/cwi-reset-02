package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesDiretorResponseMapper;
import br.com.cwi.resetflix.mapper.DiretorEntityMapper;
import br.com.cwi.resetflix.mapper.DiretoresResponseMapper;
import br.com.cwi.resetflix.repository.DiretorRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoresService {

    @Autowired
    private DiretorRepository diretorRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    static DiretoresResponseMapper MAPPER_RESPONSE = new DiretoresResponseMapper();
    static DiretorEntityMapper MAPPER_ENTITY = new DiretorEntityMapper();
    public ConsultarDetalhesDiretorResponseMapper MAPPER_DETALHES_DIRETOR = new ConsultarDetalhesDiretorResponseMapper();


    public List<DiretoresResponse> getDiretores(){
        List<DiretorEntity> diretores = diretorRepository.getDiretores();
        return MAPPER_RESPONSE.mapear(diretores);
    }

    public Long criarDiretor(final CriarDiretorRequest request){
        DiretorEntity diretorSalvo = MAPPER_ENTITY.mapear(request);
        return diretorRepository.criaDiretores(diretorSalvo);
    }

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(final Long id){
        DiretorEntity diretorSalvo = diretorRepository.acharDiretorPorID(id);
        List<FilmeEntity> filmesDiretor = filmeRepository.acharFilmesDiretor(id);
        return MAPPER_DETALHES_DIRETOR.mapear(diretorSalvo, filmesDiretor);
    }
}
