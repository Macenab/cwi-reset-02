package exercicioTres;

public class GerenciadorNotas {
    int soma = 0;

    public String nomeAluno(String aluno) {
        return aluno;
    }

    public void calculaNota(double notaFinal) {

        if (notaFinal >= 7) {
            System.out.println(" " + notaFinal + " Aprovado");
        } else {
            System.out.println(" " + notaFinal + " Reprovado");
        }
    }
}
