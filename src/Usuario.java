public class Usuario {

    private int id;
    private String nome;
    private String tipo;

    public Usuario(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", tipo=" + tipo + "]";
    }
    
    
}
