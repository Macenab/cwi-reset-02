package exercicioUm;

public class Filme {
    private String nomeFilme;
    private String descricao;
    private String duracao;
    private double avaliacao;
    private int anoDeLancamento;

    public Filme() {

        }

    ///Get e Set Filme ***************************************************

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public class Diretor {

        private String nomeDiretor;
        private int idadeDiretor;
        private int quantidadeDeFilmesDirigidos;


        public Diretor() {

        }

        //Get e Set Diretor*****************************************************

        public String getNomeDiretor() {
            return nomeDiretor;
        }

        public void setNomeDiretor(String nomeDiretor) {
            this.nomeDiretor = nomeDiretor;
        }

        public int getIdadeDiretor() {
            return idadeDiretor;
        }

        public void setIdadeDiretor(int idadeDiretor) {
            this.idadeDiretor = idadeDiretor;
        }

        public int getQuantidadeDeFilmesDirigidos() {
            return quantidadeDeFilmesDirigidos;
        }

        public void setQuantidadeDeFilmesDirigidos(int quantidadeDeFilmesDirigidos) {
            this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
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