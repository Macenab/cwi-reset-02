package exercicioUm;

public class Filme {
    private String nomeFilme;
    private String descricao;
    private String duracao;
    private double avaliacao;
    private int anoDeLancamento;

    public Filme() {

        }

    public class Diretor {

        private String nomeDiretor;
        private int idadeDiretor;
        private int quantidadeDeFilmesDirigidos;


        public Diretor() {

        }

    }

    public void reproduzir(String nomeFilme, String descricao, String duracao, String nomeDiretor) {
        System.out.println("Nome: " + nomeFilme);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + duracao);
        System.out.println("Diretor: " + nomeDiretor);
        System.out.println("Iniciando reprodução...");

    }
}