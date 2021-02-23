package com.company;

import com.company.classes.*;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Diretor diretor = new Diretor("Joany", 23, 4, Genero.MASCULINO );
//        Pessoa ator = new Ator("Carlos", 23, 3,Genero.MASCULINO);

        Filme filme = new Filme("Batman", "Esperamos q seja bom", 120
                ,2021, 4, diretor );

        Editora editora = new Editora("DC Comics", "R. Joaquim Dutra");

        filme.reproduzir();
        editora.identificaEditora();
    }

}
