package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;
import br.com.banco.desgraca.domain.enums.TipoTransacao;
import br.com.banco.desgraca.exception.ValorInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta implements ContaBancaria{

    private int numeroDaConta;
    private double saldoDaConta;
    private InstituicaoBancaria instituicaoBancaria;
    private TipoConta tipoDeConta;


    public Conta(int numeroDaConta, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
        this.instituicaoBancaria = getInstituicaoBancaria();

    }

    public Double consultarSaldo() {
        return getSaldoDaConta();
    }

    public void sacar(Double valor) {
    }

    public void depositar(Double valor) {
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    public void exibirExtrato(LocalDate inicio, LocalDate fim){
    }

    public String toString() {
        return "";
    }

    //@Getter e @Setter ---------------------------------------------

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

}
