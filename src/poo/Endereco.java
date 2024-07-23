package poo;

/**
 * Classe responsavel por armazenar os valores de um endereço.
 */
public class Endereco {

    private String estado;
    private String cidade;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
            "estado='" + estado + '\'' +
            ", cidade='" + cidade + '\'' +
            ", bairro='" + bairro + '\'' +
            '}';
    }
}
