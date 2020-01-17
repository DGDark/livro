package SistemaLivraria;

public class Livro {
    private String titulo ;
    private int totalPagina ;
    private String genero ;
    private Autor  autor ;
    private String editora ;
    private int paginaAtual;
    private int anoPublicacao;





    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro( String titulo, int totalPagina, String genero, Autor autor, String editora, int paginaAtual, int anoPublicacao) {

        this.titulo = titulo;
        this.totalPagina = totalPagina;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicacao = anoPublicacao;
    }

    public String retornarDadosBacicos() {
        return "Livro{" +

                ", titulo='" + titulo + '\'' +
                ", totalPagina=" + totalPagina +
                ", genero='" + genero + '\'' +
                ", autor=" + autor +
                ", editora='" + editora + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
    public enum TipoGenero{
        cronica,
        literatura,
        cientifico,
        ficçao,
        terror,
        ação,
        poema,



    }
    boolean aberto;
    public void AbriLivro(){
        this.aberto =true;
        System.out.println(true);
    }
    public void FecharLivro(){
        this.aberto = false;
        System.out.println(false);
    }

    public void proximaPagina(){
        if (this.aberto == true);
            paginaAtual++;
    }
    public void paginaAnterior() {
        if (this.aberto == true) ;
        paginaAtual--;
    }
    public void folhear() {
        if (this.aberto == true) ;
        paginaAtual +=(10);
    }
}
