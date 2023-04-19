package br.com.patrick.minhasfinancas.model.repository;

import br.com.patrick.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Optional<Usuario> findByEmail(String email); // query methods
    //Optional<Usuario> findByEmailAndNome(String email, String nome);
    boolean existsByEmail(String email); // Aqui eu retorno V ou F na opcao acima eu retornaria o usuario todo
    Optional<Usuario> findByEmail(String email);

}
