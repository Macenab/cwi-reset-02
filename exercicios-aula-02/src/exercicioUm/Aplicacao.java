package exercicioUm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataDeNascimento = LocalDate.parse("12-08-1980", formatter);

        List<Pessoa> elenco = new ArrayList<>();

        elenco.add(new Diretor("Braulio", 23, Genero.MASCULINO, dataDeNascimento));
        elenco.add(new Ator("Blake", 54, 45, Genero.NAO_BINARIO, dataDeNascimento));
        Filme filme = new Filme("O Clube da Luta", "Filme ficticio", "120 minutos", elenco);
        Filme filme2 = new Filme("V de violão", "Filme ficticio", "3 horas", elenco);

        filme.reproduzir();
        filme.exibirCreditos();
        System.out.println("");


        filme2.reproduzir();
        filme2.exibirCreditos();
        System.out.println("");

//       ator.printaAtributos();
//       System.out.println("");
//
//       diretor.printaAtributos();

    }
}
