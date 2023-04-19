package proxy;

import java.util.HashMap;
        import java.util.Map;

public class Biblioteca {
    private static Map<Integer, Livro> livros = new HashMap<>();

    public static Livro getLivro(Integer identificador) {
        return livros.get(identificador);
    }

    public static void addBook(Livro livro) {
        livros.put(livro.getIdentificador(), livro);
    }
}


