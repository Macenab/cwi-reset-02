package br.com.banco.desgraca.domain.enums;

public enum TipoConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_DIGITAL("Conta Digital"),
    CONTA_POUPANCA("Conta Poupança");

    private String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
