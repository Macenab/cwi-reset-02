package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

import java.time.LocalDate;

public class ContaCorrente extends Conta implements ContaBancaria {


    private TipoConta tipoDeConta;
    private InstituicaoBancaria instituicaoBancaria;

    public ContaCorrente(Conta conta, TipoConta tipoDeConta, InstituicaoBancaria instituicaoBancaria) {
        super(conta.getNumeroDaConta(), conta.getSaldoDaConta());
        this.instituicaoBancaria = instituicaoBancaria;
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
        System.out.print("Saldo atual: R$");
        return this.getSaldoDaConta();
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new RuntimeException("O valor do depósito tem que ser maior que R$0");
        } else {
            this.setSaldoDaConta(getSaldoDaConta() + valor);
        }
    }

    @Override
    public void sacar(Double valor) {

        if (valor % 5 != 0) {
            throw new RuntimeException("O valor a ser sacado necessita ser multiplo de R$5,00");
        } else if (valor >= this.getSaldoDaConta()) {
            throw new RuntimeException("O valor a ser sacado excede o saldo atual da conta.");
        } else {
            this.setSaldoDaConta(getSaldoDaConta() - valor);
            System.out.println("O valor a ser sacado é: R$" + valor);
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

        if (valor <= 0) {
            throw new RuntimeException("O valor a ser transferido precisa ser maior que R$0,0");
        } else if (contaDestino.getInstituicaoBancaria() != this.getInstituicaoBancaria()) {
            setSaldoDaConta(getSaldoDaConta() - (valor - (1d) / 100));
        } else {
            setSaldoDaConta(getSaldoDaConta() + valor);
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }


}