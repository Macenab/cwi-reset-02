package exercicioUm;

public class Filme {
    private String nomeFilme;
    private String descricao;
    private String duracao;
    private double avaliacao;
    private int anoDeLancamento;

    public Filme(String nomeFilme, String descricao, String duracao) {
        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.anoDeLancamento = anoDeLancamento;

    }

    public void reproduzir (Diretor nomeDiretor) {
        System.out.println("Nome: " + this.nomeFilme);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Diretor: " + nomeDiretor.getNomeDiretor());
        System.out.println("Iniciando reprodução...");

    }
}