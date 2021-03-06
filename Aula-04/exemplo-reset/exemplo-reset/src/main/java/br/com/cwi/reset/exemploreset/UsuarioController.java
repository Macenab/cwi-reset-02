package br.com.cwi.reset.exemploreset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Usuario")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuarioService.obterAluno();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping
    public Usuario deletarUsuario(@PathVariable("id") int idDeletar){
        return usuarioService.deletarUsuario(idDeletar);
    }

}
