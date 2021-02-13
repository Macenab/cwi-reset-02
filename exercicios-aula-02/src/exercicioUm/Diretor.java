package exercicioUm;

public class Diretor extends Pessoa {

    private int quantidadeDeFilmesDirigidos;


    public Diretor(String nome, int idade, int quantidadeDeFilmesDirigidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public void printaAtributos() {
        super.printaAtributos();
    }

//    public String getNomeDiretor() {
//            return nome;
//        }


//    public void diretorMethod () {
//        System.out.println("Nome: " + this.nomeDiretor);
//        System.out.println("Idade: " + this.idadeDiretor);
//        System.out.println("Genero: " + this.genero.getGenero());
//
//    }
}
