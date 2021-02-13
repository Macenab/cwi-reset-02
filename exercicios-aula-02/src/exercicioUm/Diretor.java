package exercicioUm;

public class Diretor {

        private String nomeDiretor;
        private int idadeDiretor;
        private int quantidadeDeFilmesDirigidos;
        private Genero genero;

    public Diretor(String nomeDiretor, int idadeDiretor, int quantidadeDeFilmesDirigidos, Genero genero) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
        this.genero = genero;
    }

    public String getNomeDiretor() {
            return nomeDiretor;
        }

    public void diretorMethod () {
        System.out.println("Nome: " + this.nomeDiretor);
        System.out.println("Idade: " + this.idadeDiretor);
        System.out.println("Genero: " + this.genero);


    }
}
