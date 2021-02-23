package br.com.banco.desgraca.domain.enums;

public enum TipoTransacao {

    DEPOSITO("Depósito"),
    TRANSFERENCIA("Tranferência"),
    SAQUE("Saque");

    private String tipoTransacao;

    TipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }
}