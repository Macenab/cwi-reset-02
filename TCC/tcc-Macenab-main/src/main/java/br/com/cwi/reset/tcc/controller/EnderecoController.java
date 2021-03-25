package br.com.cwi.reset.tcc.controller;

import br.com.cwi.reset.tcc.dominio.Endereco;
import br.com.cwi.reset.tcc.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

//    @PostMapping("usuarios/{id}/enderecos")
//    @ResponseStatus(HttpStatus.CREATED)
//    public List<Endereco> saveEndereco(@RequestBody @Valid Endereco endereco){
//        return enderecoRepository.saveEndereco(endereco) ;
//    }
}
