package br.com.cwi.reset.exemploreset;

import br.com.cwi.reset.exemploreset.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public Usuario addUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario removeUsuario(Usuario usuario){
        usuarios.remove(usuario);
        return usuario;
    }

}
