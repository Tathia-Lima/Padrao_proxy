package proxy;

import java.util.Arrays;
import java.util.List;

public class Livro implements IBook {

    private Integer identificador;
    private String nomeLivro;
    private String editora;
    private int paginasCapitulo1;
    private int paginasCapitulo2;
    private int paginasCapitulo3;

    public Livro(int identificador) {
        this.identificador = identificador;
        Livro objeto = Biblioteca.getLivro(identificador);
        this.nomeLivro = objeto.nomeLivro;
        this.editora = objeto.editora;
        this.paginasCapitulo1 = objeto.paginasCapitulo1;
        this.paginasCapitulo2 = objeto.paginasCapitulo2;
        this.paginasCapitulo3 = objeto.paginasCapitulo3;
    }

    public Livro(Integer identificador, String nomeLivro, String editora, int paginasCapitulo1, int paginasCapitulo2, int paginasCapitulo3) {
        this.identificador = identificador;
        this.nomeLivro = nomeLivro;
        this.editora = editora;
        this.paginasCapitulo1 = paginasCapitulo1;
        this.paginasCapitulo2 = paginasCapitulo2;
        this.paginasCapitulo3 = paginasCapitulo3;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    @Override
    public List<String> obterDadosBook() {
        return Arrays.asList(this.nomeLivro, this.editora);
    }

    @Override
    public List<Integer> obterCapitulos(Usuario usuario) {
        return Arrays.asList(this.paginasCapitulo1, this.paginasCapitulo2, this.paginasCapitulo3);
    }

    public int obterQuantidadePaginas() {
        return this.paginasCapitulo1 + this.paginasCapitulo2 + this.paginasCapitulo3;
    }
}
