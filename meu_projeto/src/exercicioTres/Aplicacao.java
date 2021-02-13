package exercicioTres;

public class Aplicacao {
    public static void main(String[] args) {
        GerenciadorNotas situacao = new GerenciadorNotas();

        System.out.print(situacao.nomeAluno("Bruno"));
        situacao.calculaNota(5);

    }
}
