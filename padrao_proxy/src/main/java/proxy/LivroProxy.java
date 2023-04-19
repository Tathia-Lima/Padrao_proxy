package proxy;
import java.util.List;

public class LivroProxy implements IBook {

    private Livro livro;

    private Integer identificador;

    public LivroProxy(Integer identificador) {
        this.identificador = identificador;
    }

    @Override
    public List<String> obterDadosBook() {
        if (this.livro == null) {
            this.livro = new Livro(this.identificador);
        }
        return this.livro.obterDadosBook();
    }

    @Override
    public List<Integer> obterCapitulos(Usuario usuario) {
        if (!usuario.isAssinante()) {
            throw new IllegalArgumentException("Usuario não identificado");
        }
        if (this.livro == null) {
            this.livro = new Livro(this.identificador);
        }
        return this.livro.obterCapitulos(usuario);
    }
}