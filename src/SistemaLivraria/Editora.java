package SistemaLivraria;

public class Editora {

    private  String nome = "LeYa";
    private  int ano = 2007;
    private  int cnpj = 234455/6454;
    private  String endereco ="";
    private  String pais = "portugal";
    private  String estado = "lisboa";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editora(String nome, int ano, int cnpj, String endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;


    }


    public String retornarDadosBasicos() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", cnpj=" + cnpj +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
