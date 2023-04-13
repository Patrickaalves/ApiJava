package br.com.patrick.minhasfinancas.service;

import br.com.patrick.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
    Usuario autenticar(String email, String senha);
    Usuario salvarUsuario(Usuario usuario);
    void validarEmail(String email);

}
