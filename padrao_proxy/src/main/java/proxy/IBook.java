package proxy;
import java.util.List;

public interface IBook {
    List<String> obterDadosBook();
    List<Integer> obterCapitulos(Usuario usuario);
}