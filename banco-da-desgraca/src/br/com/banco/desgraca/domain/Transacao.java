package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.domain.enums.TipoTransacao;

import java.time.LocalDate;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDate data;
    private double valorDaTransacao;

    public Transacao(TipoTransacao tipoTransacao, LocalDate data, double valorDaTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.data = data;
        this.valorDaTransacao = valorDaTransacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorDaTransacao() {
        return valorDaTransacao;
    }
}



