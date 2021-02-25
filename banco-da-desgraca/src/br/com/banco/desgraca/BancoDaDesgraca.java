package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;
import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrenteNU = new ContaCorrente(new Conta(12345,35000d),
                TipoConta.CONTA_CORRENTE, InstituicaoBancaria.NUBANK);

        ContaDigital contaDigitalNU = new ContaDigital(new Conta(12346, 53400d),
                TipoConta.CONTA_DIGITAL, InstituicaoBancaria.ITAU);

        ContaPoupanca contaPoupancaNU = new ContaPoupanca(new Conta(12435, 50000d),
                TipoConta.CONTA_POUPANCA, InstituicaoBancaria.BANCO_DO_BRASIL);

        System.out.println(contaCorrenteNU.consultarSaldo());
        contaCorrenteNU.depositar(25000d);
        System.out.println(contaCorrenteNU.consultarSaldo());
        contaCorrenteNU.sacar(750d);
        System.out.println(contaCorrenteNU.consultarSaldo());
        System.out.println("\n");

        contaCorrenteNU.depositar(1000d);
        contaCorrenteNU.transferir(1000d, contaDigitalNU);
        contaCorrenteNU.sacar(1000d);
        contaCorrenteNU.exibirExtrato(LocalDate.parse("2020-02-23"), LocalDate.parse("2020-02-29"));
        System.out.println("");

        contaPoupancaNU.depositar(2000d);
        contaPoupancaNU.transferir(2000d, contaCorrenteNU);
        contaPoupancaNU.sacar(2000D);
        contaPoupancaNU.exibirExtrato(LocalDate.parse("2020-02-23"), LocalDate.parse("2020-02-29"));
        System.out.println("");


        contaDigitalNU.depositar(3000d);
        contaDigitalNU.transferir(3000d, contaCorrenteNU);
        contaDigitalNU.sacar(3000d);
        contaDigitalNU.exibirExtrato(LocalDate.parse("2020-02-23"), LocalDate.parse("2020-02-29"));








    }
}