package proxy;
public class Usuario {
    private String nome;
    private boolean assinante;

    public Usuario(String nomeLivro, boolean assinante) {
        this.nome = nomeLivro;
        this.assinante = assinante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}