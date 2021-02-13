package exercicioUm;

public class Ator extends Pessoa {
    private int numeroDeOscars;


    public Ator(String nome, int idade, int numeroDeOscars, Genero genero) {
        super(nome, idade, genero);
        this.numeroDeOscars = numeroDeOscars;

    }

    public void printaAtributos() {
        super.printaAtributos();
    }

//    public void atorMethod() {
//        System.out.println("Nome: " + this.nomeAtor);
//        System.out.println("Idade: " + this.idadeAtor);
//        System.out.println("Genero: " + this.genero.getGenero());
//    }

}