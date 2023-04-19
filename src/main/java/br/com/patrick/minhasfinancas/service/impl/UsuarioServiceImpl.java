package br.com.patrick.minhasfinancas.service.impl;

import br.com.patrick.minhasfinancas.exceptions.ErroAutenticacao;
import br.com.patrick.minhasfinancas.exceptions.RegraNegocioException;
import br.com.patrick.minhasfinancas.model.entity.Usuario;
import br.com.patrick.minhasfinancas.model.repository.UsuarioRepository;
import br.com.patrick.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository repository;


    public UsuarioServiceImpl(UsuarioRepository repository) {
        super();
        this.repository = repository;
    }
    @Override
    public Usuario autenticar(String email, String senha) {
        Optional<Usuario> usuario = repository.findByEmail(email);
        if (usuario.isPresent()){
            throw new ErroAutenticacao("Usuario não encontrado para o email informado");
        }
        if(usuario.get().getSenha().equals(senha)){
            throw new ErroAutenticacao("Senha invalida");
        }
        return usuario.get();
    }

    @Override
    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {
        validarEmail(usuario.getEmail());

        return repository.save(usuario);
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if (existe){
            throw new RegraNegocioException("Ja existe um suario cadastrado com esse email");
        }
    }
}
