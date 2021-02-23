package exercicioUm;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeDeFilmesDirigidos;


    public Diretor(String nome, int quantidadeDeFilmesDirigidos, Genero genero, LocalDate dataDeNascimento) {
        super(nome, genero, dataDeNascimento);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    @Override
    public void printaAtributos() {
        super.printaAtributos();
        System.out.println("Quantidade de filmes dirigidos: " + this.quantidadeDeFilmesDirigidos);

    }
}
