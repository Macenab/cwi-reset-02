package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;
import br.com.banco.desgraca.domain.enums.TipoTransacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContaDigital extends Conta {

    private TipoConta tipoDeConta;
    private InstituicaoBancaria instituicaoBancaria;
    private List<Transacao> transacao;

    public ContaDigital(Conta conta, TipoConta tipoDeConta, InstituicaoBancaria instituicaoBancaria) {
        super(conta.getNumeroDaConta(), conta.getSaldoDaConta());
        this.instituicaoBancaria = instituicaoBancaria;
        this.tipoDeConta = tipoDeConta;
        transacao = new ArrayList<>();


        if (instituicaoBancaria == InstituicaoBancaria.BANCO_DO_BRASIL) {
            throw new RuntimeException("Essa instituição não tem opção CONTA DIGITAL.");
        } else if (instituicaoBancaria == InstituicaoBancaria.CAIXA) {
            throw new RuntimeException("Essa instituição não tem opção CONTA DIGITAL.");
        } else if (instituicaoBancaria == InstituicaoBancaria.BRADESCO) {
            throw new RuntimeException("Essa instituição não tem opção CONTA DIGITAL.");
        }

    }

    @Override
    public String toString() {
        return super.toString();
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
            throw new ValorInvalidoException("O valor do depósito tem que ser maior que R$0");
        } else {
            transacao.add(new Transacao(TipoTransacao.DEPOSITO, Data.getDataTransacao(), valor));
            this.setSaldoDaConta(getSaldoDaConta() + valor);
            System.out.println("Depositando: " + DecimalFormat.getCurrencyInstance().format(valor)
                    + " na " + tipoDeConta.getTipoConta() + " " + getInstituicaoBancaria() );
        }
    }

    @Override
    public void sacar(Double valor) {

        if (valor <= 10d) {
            throw new ValorInvalidoException("O valor a ser sacado necessita ser maior que R$10,00.");
        } else if (valor >= getSaldoDaConta()) {
            throw new ValorInvalidoException("O valor a ser sacado excede o saldo atual da conta.");
        } else {
            transacao.add(new Transacao(TipoTransacao.SAQUE, Data.getDataTransacao(), valor));
            this.setSaldoDaConta(getSaldoDaConta() - valor);
            System.out.println("a valor a ser sacado é: " + DecimalFormat.getCurrencyInstance().format(valor));

        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

        if (valor <= 0) {
            throw new ValorInvalidoException("O valor a ser transferido precisa ser maior que R$0,0");

        } else if (getSaldoDaConta() <= 0) {
            throw new SaldoInsuficienteException("O saldo da conta se encontra vazio");

        } else {
            transacao.add(new Transacao(TipoTransacao.TRANSFERENCIA, Data.getDataTransacao(), valor));
            setSaldoDaConta(getSaldoDaConta() - valor);
            Conta conta = (Conta) contaDestino;
            conta.setSaldoDaConta(conta.getSaldoDaConta() + valor);
            System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance().format(valor)
                    + " da " + getInstituicaoBancaria()
                    + " para " + contaDestino.getInstituicaoBancaria());

        }
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("");
        System.out.println("---- EXTRATO " + tipoDeConta.getTipoConta().toUpperCase(Locale.ROOT)
                + ": " + getInstituicaoBancaria());
        if (fim.isBefore(inicio)) {
            throw new ValorInvalidoException("A data final precisa ser maior que a data inicial");
        } else {
            for (Transacao transacao : transacao) {
                System.out.println(transacao.getTipoTransacao().getDescricaoTipoTransacao() + " "
                        + DecimalFormat.getCurrencyInstance().format(transacao.getValorDaTransacao()) + " "
                        + transacao.getData());
            }
        }
        super.exibirExtrato(inicio, fim);
    }
}
