package poo;
/**
Classe responsavel por armazenar os valores de um cliente.
 */
public class Cliente {

    private String nome;
    private String email;
    private Endereco endereco;
    private int telefone;

    /**
   Construtor default.
     */
    public Cliente() {
    }

    /**
     * Construtor inicializado com os parametros:
     * @String nome
     * @String email
     * @Endereco endereco
     * @int telefone
     */
    public Cliente(String nome, String email, Endereco endereco, int telefone) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Métodos getters e setters.
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
