package SistemaLivraria;

public class Autor {
    private  String nome = "George  ";
    private  String sobreNome = "R.R Martin";
    private  String generoLiterario = "croinca";
    private  String sexo = "masculino";
    private  String pais = "EUA";
    private  String cidade = "new jersey";
    private  int    idade = 71;

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

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Autor(String nome, String sobreNome, String generoLiterario, String sexo, String pais, String cidade, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.generoLiterario = generoLiterario;
        this.sexo = sexo;
        this.pais = pais;
        this.cidade = cidade;
        this.idade = idade;


    }


    public String retornarDadosBasicos() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", generoLiterario='" + generoLiterario + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}

