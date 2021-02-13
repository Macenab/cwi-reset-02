package exercicioUm;

public class Ator {
    private String nomeAtor;
    private int idadeAtor;
    private int numeroDeOscars;
    private Genero genero;

    public Ator(String nome, int idade, int numeroDeOscars, Genero genero) {
        this.nomeAtor = nome;
        this.idadeAtor = idade;
        this.numeroDeOscars = numeroDeOscars;
        this.genero = genero;
    }

    public void atorMethod() {
        System.out.println("Nome: " + this.nomeAtor);
        System.out.println("Idade: " + this.idadeAtor);
        System.out.println("Genero: " + this.genero);
    }

}