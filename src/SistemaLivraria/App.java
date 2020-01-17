package SistemaLivraria;

public class App {
    public static void main(String[] args) {

        Autor autor1= new Autor("George",
                "R.R Martin",
                "cronica",
                "masculino",
                "EUA",
                "NEW JERSEY",
                71
                );

        Livro livro1 = new Livro("As cronicas de gelo e fogo",
                592,
                Livro.TipoGenero.cronica.toString(),
                autor1,
                "LeYa",
                55,
                20115
        );

        Editora editora1 = new Editora("LeYa",
                2007,
                133454357/435435,
                "Av. de Roma 11A, 1000-303 Lisboa, Portugal",
                "Portugal",
                "Lisboa");

        livro1.AbriLivro();
        if(livro1.aberto) {
            System.out.println(autor1.retornarDadosBasicos());
            System.out.println(livro1.retornarDadosBacicos());
            System.out.println(editora1.retornarDadosBasicos());
        }
        else{
            System.out.println("Livro fechado");
        }
        livro1.folhear();


    }
}
