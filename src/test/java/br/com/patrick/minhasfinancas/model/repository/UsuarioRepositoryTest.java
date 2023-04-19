package br.com.patrick.minhasfinancas.model.repository;

import br.com.patrick.minhasfinancas.model.entity.Usuario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.assertj.core.api.Assertions;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@SpringBootTest
public class UsuarioRepositoryTest {
    @Autowired
    UsuarioRepository repository;
    @Test
    public void deveVerificarAExistenciaDeUmEmail(){
        //cenario
        Usuario usuario = Usuario.builder().nome("Ola").email("usuario@email.com").build();

        repository.save(usuario);

        //Ação eOu execução
        boolean result = repository.existsByEmail("usuario@email.com");

        //verificação
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComEmail(){
        //Cenario
        repository.deleteAll();

        //acao
        boolean result = repository.existsByEmail("usuario@email.com");

        //verificacao
        Assertions.assertThat(result).isFalse();
    }
}
