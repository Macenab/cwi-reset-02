package exercicioUm;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;


    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void printaAtributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.idade);
        System.out.println("Nome: " + this.genero.getGenero());
    }
}
