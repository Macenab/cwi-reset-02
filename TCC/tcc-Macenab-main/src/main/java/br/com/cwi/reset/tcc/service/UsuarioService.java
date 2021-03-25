package br.com.cwi.reset.tcc.service;

import br.com.cwi.reset.tcc.dominio.Endereco;
import br.com.cwi.reset.tcc.dominio.Usuario;
import br.com.cwi.reset.tcc.exception.*;
import br.com.cwi.reset.tcc.repository.EnderecoRepository;
import br.com.cwi.reset.tcc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    /**
     * busca todos
     *
     * @return
     */
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    /**
     * salva usuario
     *
     * @param usuario
     * @return
     */
    public Usuario salvarUsuario(Usuario usuario) {
        validaUsuario(usuario);
        return usuarioRepository.save(usuario);
    }

    /**
     * Acha usuario por ID
     *
     * @param id
     * @return
     */

    public Usuario findById(Long id) {
        checarConsistencia(id);
        return usuarioRepository.findById(id).orElse(null);
    }

    /**
     * Atualiza os dados do Usuário/POST
     *
     * @param usuario
     * @return
     */
    public Usuario updateUsuario(Long id, Usuario usuario) {
//        validaUpdate(usuario);
        if(!usuarioRepository.existsById(id)){
            throw new RuntimeException();
        }
        return usuarioRepository.save(usuario);
    }

    /**
     * valida se o email já foi cadastrado.
     * valida se o cpf já foi cadastrado.
     *
     * @param usuario
     */
    public void validaUsuario(Usuario usuario) {

        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new EmailAlreadyExistsException();
        }

        if (usuarioRepository.existsByCpf(usuario.getCpf())) {
            throw new CpfAlreadyExistsException();
        }
    }

    /**
     * checa o banco de dados sobre existencia de um Id
     *
     * @param id
     */
    public void checarConsistencia(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new IdNotFoundException();
        }
    }


    /**
     * Valida campos obrigatórios do método POST
     *
     * @param usuario
     */

//    public void validaUpdate(Usuario usuario) {
//        if (usuario.getNome().isEmpty()) {
//            throw new NomeNecessarioException();
//        }
//
//        if(usuario.getCpf() != null) {
//            throw new CpfAlreadyPersistedException();
//        }
//
//        if (usuario.getEmail().isEmpty()) {
//            throw new EmailNecessarioException();
//        }
//
//        if (usuario.getSenha().isEmpty()) {
//            throw new SenhaNecessariaException();
//        }
//    }
}
