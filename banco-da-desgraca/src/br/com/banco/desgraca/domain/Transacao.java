package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.domain.enums.TipoTransacao;

import java.time.LocalDate;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDate data;
    private double valorDaTransacao;
}
