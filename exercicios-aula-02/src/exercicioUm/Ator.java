package exercicioUm;

import java.time.LocalDate;

public class Ator extends Pessoa {
    private int numeroDeOscars;


    public Ator(String nome, int idade, int numeroDeOscars, Genero genero, LocalDate dataDeNascimento) {
        super(nome, genero, dataDeNascimento);
        this.numeroDeOscars = numeroDeOscars;

    }
    @Override
   public void printaAtributos() {
        super.printaAtributos();
       System.out.println("Numero de Oscars: " + this.numeroDeOscars);

   }

}