package br.com.banco.desgraca.domain.enums;

public enum TipoTransacao {

    DEPOSITO(" + "),
    TRANSFERENCIA(" - "),
    SAQUE(" - ");

    private String descricaoTipoTransacao;

    TipoTransacao(String tipoTransacao) {
        this.descricaoTipoTransacao = tipoTransacao;
    }

    public String getDescricaoTipoTransacao() {
        return descricaoTipoTransacao;
    }
}