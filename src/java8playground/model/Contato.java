package java8playground.model;

/**
 *
 * @author Odilon
 */
public class Contato {

    private static long idGenerator;
    
    private long id;
    private String nome;
    private String sobreNome;
    private String fone;
    private String email;

    public Contato(long id, String nome, String sobreNome, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.fone = fone;
        this.email = email;
    }
    
    public Contato(String nomeCompleto, String fone, String email) {
        this(++idGenerator, nomeCompleto.split(" ", 2)[0],
             nomeCompleto.split(" ", 2)[1], fone, email);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", fone=" + fone + ", email=" + email + '}';
    }
}
