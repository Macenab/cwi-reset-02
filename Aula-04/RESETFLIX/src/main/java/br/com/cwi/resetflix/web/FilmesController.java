package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController implements FilmesContract {

    @Autowired
    private FilmesService filmesService;
    //TODO Implementar service

    @Override
    @GetMapping
    public List<FilmeResponse> getFilmes(@RequestParam(value = "genero", required = false) final Genero genero) {
        //TODO realizar chamada
        return filmesService.getFilmes();
    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesFilmeResponse getFilmeById(@PathVariable("id") final Long id) {
        //TODO realizar chamada
        return filmesService.getFilmeById(id);
    }

    @Override
    @PostMapping
    public Long criarFilme(@RequestBody final CriarFilmeRequest request) {
        //TODO realizar chamada
    return filmesService.criarFilme(request);
    }

    @Override
    @GetMapping("/recomendacoes")
    public List<FilmeResponse> getRecomendacoesFilmes() {
        //TODO realizar chamada
        return Collections.emptyList();
    }

    @Override
    @PostMapping("/{id}/assistir")
    public void assistirFilme(@PathVariable("id") final Long id) {
        //TODO realizar chamada
    }
}
