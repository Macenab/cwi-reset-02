package exercicioUm;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;
    private LocalDate dataDeNascimento;


    public Pessoa(String nome, Genero genero, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
    }


    public void printaAtributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Genero: " + this.genero.getGenero());
    }

}
