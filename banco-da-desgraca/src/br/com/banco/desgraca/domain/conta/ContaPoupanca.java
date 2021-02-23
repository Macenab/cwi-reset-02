package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

import java.time.LocalDate;

public class ContaPoupanca implements ContaBancaria {

    private int numeroConta;
    private InstituicaoBancaria instituicaoBancaria;
    private TipoConta tipoDeConta;
    private double saldo;

    public ContaPoupanca(int numeroConta, InstituicaoBancaria instituicaoBancaria, TipoConta tipoDeConta, double saldo) {
        this.numeroConta = numeroConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return this.tipoDeConta + super.toString();
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }
}
