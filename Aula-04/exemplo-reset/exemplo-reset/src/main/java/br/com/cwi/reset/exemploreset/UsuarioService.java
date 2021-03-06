package br.com.cwi.reset.exemploreset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterAluno() {
        return usuarioRepository.getUsuarios();
    }

    public Usuario criarUsuario(Usuario usuario) {
        if (usuario == null ) {

        }
        return usuarioRepository.addUsuario(usuario);
    }

    public Usuario deletarUsuario(Usuario usuario) {
        if (usuario != null) {
        }
        return usuarioRepository.removeUsuario(usuario);
    }
}
