package br.com.patrick.minhasfinancas.service.impl;

import br.com.patrick.minhasfinancas.exceptions.RegraNegocioException;
import br.com.patrick.minhasfinancas.model.entity.Usuario;
import br.com.patrick.minhasfinancas.model.repository.UsuarioRepository;
import br.com.patrick.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository repository;


    public UsuarioServiceImpl(UsuarioRepository repository) {
        super();
        this.repository = repository;
    }
    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if (existe){
            throw new RegraNegocioException("Ja existe um suario cadastrado com esse email");
        }
    }
}
