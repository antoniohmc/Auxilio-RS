package poo;

public class Cliente {

    private String nome;
    private String email;
    private Endereco endereco;
    private int telefone;



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
