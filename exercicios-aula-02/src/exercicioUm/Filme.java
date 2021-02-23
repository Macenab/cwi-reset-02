package exercicioUm;

import java.util.List;

public class Filme {
    private String nomeFilme;
    private String descricao;
    private String duracao;
    private double avaliacao;
    private int anoDeLancamento;
    private List<Pessoa> elenco;

    public Filme(String nomeFilme, String descricao, String duracao, List<Pessoa> elenco) {
        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.anoDeLancamento = anoDeLancamento;
        this.elenco = elenco;

        if (nomeFilme == "O Clube da Luta") {
            this.avaliacao = 5;
        } else if (this.nomeFilme == "Batman vs Superman") {
            this.avaliacao = 1;
        } else {
            this.avaliacao = 3;
        }

    }


    public void reproduzir() {
        System.out.println("Nome: " + this.nomeFilme);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Iniciando reprodução...");

    }

    public void exibirCreditos() {
        for (Pessoa pessoa : elenco) {
            pessoa.printaAtributos();
        }
    }
}