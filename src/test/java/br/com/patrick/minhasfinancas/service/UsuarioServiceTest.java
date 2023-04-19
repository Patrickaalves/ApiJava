package br.com.patrick.minhasfinancas.service;

import br.com.patrick.minhasfinancas.exceptions.RegraNegocioException;
import br.com.patrick.minhasfinancas.model.entity.Usuario;
import br.com.patrick.minhasfinancas.model.repository.UsuarioRepository;
import br.com.patrick.minhasfinancas.service.impl.UsuarioServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertFalse;



import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class UsuarioServiceTest {
    UsuarioService service;
    UsuarioRepository repository;

    /*

    @Before
    public void setUp(){
        repository = mock(UsuarioRepository.class);
        service  = new UsuarioServiceImpl(repository);

    }

    @Test
    public void deveValidarEmail() {
        Assertions.assertDoesNotThrow(() -> {
            //cenario
            Mockito.when(repository.existsByEmail(Mockito.anyString())).thenReturn(false);

            // acao
            service.validarEmail("usuario@gmail.com");
        });
    }

    @Test
    public void DeveLancarErroAoValidarEmailQuandoexistirEmailCadastrado(){
        Assertions.assertThrows(RegraNegocioException.class, () -> {
            //cenario
            Usuario usuario = Usuario.builder().nome("Patrick").email("usuario@gmail.com").build();
            repository.save(usuario);

            //acao
            service.validarEmail("usuario@gmail.com");

        });
    }

    @Test
    public void devePersistirUmUsuarioNaBaseDeDados(){
        //cenario
        Usuario usuario = Usuario.builder().nome("Patrick").email("usuario@gmail.com").senha("senha").build();

        //Acao
        Usuario usuarioSalvo = repository.save(usuario);

        //verifcacao
        assertNotNull(usuarioSalvo.getId());
    }

    @Test
    public void deveBuscarUmUsuarioPorEmail(){
        //cenario
        Usuario usuario = criarUsuario();
        Usuario usuarioSalvo = repository.save(usuario);

        //Verificacao
        Optional<Usuario> result = repository.findByEmail("usuario@gmail.com");
        assertTrue(result.isPresent());
    }

    @Test
    public void deveRetornarVazioAoBuscarPorEmailQuandoNaoExisteNaBase(){

        //Verificacao
        Optional<Usuario> result = repository.findByEmail("usuario@gmail.com");
        assertFalse(result.isPresent());
    }

    public static Usuario criarUsuario(){
        return Usuario.builder().nome("Patrick").email("usuario@gmail.com").senha("senha").build();
    }
    */
}
