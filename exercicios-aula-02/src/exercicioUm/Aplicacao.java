package exercicioUm;

public class Aplicacao {
    public static void main(String[] args) {

        Filme filme = new Filme("Meu nome não é carlos", "Filme ficticio", "120 minutos");
        Filme filme2 = new Filme("V de violão", "Filme ficticio", "3 horas");
        Diretor diretor = new Diretor("Braulio", 32, 23, Genero.MASCULINO);
        Ator ator = new Ator("Blake", 54, 45, Genero.NAO_BINARIO);

        filme.reproduzir(diretor);
        System.out.println("");

        filme2.reproduzir(diretor);
        System.out.println("");

        ator.printaAtributos();
        System.out.println("");

        diretor.printaAtributos();

    }
}
