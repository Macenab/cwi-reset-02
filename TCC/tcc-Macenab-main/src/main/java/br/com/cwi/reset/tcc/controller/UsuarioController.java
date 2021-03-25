package br.com.cwi.reset.tcc.controller;

import br.com.cwi.reset.tcc.dominio.Endereco;
import br.com.cwi.reset.tcc.dominio.Usuario;
import br.com.cwi.reset.tcc.repository.UsuarioRepository;
import br.com.cwi.reset.tcc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findByid(@PathVariable("id") Long id){
        return usuarioService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario salvarUsuarios(@RequestBody @Valid Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);

    }

    @Transactional
    @PutMapping(value = "/{id}")
    public Usuario updateUsuario(@PathVariable("id") @Valid Long id, Usuario usuario){
        return usuarioService.updateUsuario(usuario.getId(), usuario);
    }

}
