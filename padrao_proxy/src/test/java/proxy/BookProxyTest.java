package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookProxyTest {

    @BeforeEach
    void setUp() {
        Biblioteca.addBook(new Livro(1, "Engenharia de Software", "Nova", 15, 25,35));
        Biblioteca.addBook(new Livro(2, "Teste de Software", "XWS", 45,55,63));
    }

    @Test
    void deveRetornarDadosBook() {
        LivroProxy livro = new LivroProxy(1);
        assertEquals(Arrays.asList("Engenharia de Software", "Nova"), livro.obterDadosBook());
    }

    @Test
    void deveRetonarQntPaginaCapitulosBook() {
        Usuario usuario = new Usuario("Ana", true);
        LivroProxy livro = new LivroProxy(2);

        assertEquals(Arrays.asList(45, 55, 63), livro.obterCapitulos(usuario));
    }

    @Test
    void deveRetonarQntPaginasLivro() {
        Livro livro = new Livro(1);
        assertEquals(75, livro.obterQuantidadePaginas());
    }

    @Test
    void deveRetonarExcecaoUsuarioNãoHabilitadoParaVisualizarBook() {
        try {
            Usuario usuario = new Usuario("Usuário não Habilitado", false);
            LivroProxy livro = new LivroProxy(2);

            livro.obterCapitulos(usuario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Usuario não identificado", e.getMessage());
        }
    }
}