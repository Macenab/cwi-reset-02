package exercicioUm;

public class Aplicacao {
    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.reproduzir("Meu nome não é carlos",
                "Filme ficticio",
                "120 minutos",
                "Braulio");

        System.out.println("");

        filme.reproduzir("V de violão",
                "Filme ficticio",
                "3 horas",
                "Eduardo");
    }
}
