package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrenteNU = new ContaCorrente(new Conta(12345,35000d),
                TipoConta.CONTA_CORRENTE, InstituicaoBancaria.NUBANK);

        System.out.println(contaCorrenteNU.consultarSaldo());
        contaCorrenteNU.depositar(25000d);
        System.out.println(contaCorrenteNU.consultarSaldo());
        contaCorrenteNU.sacar(750d);
        System.out.println(contaCorrenteNU.consultarSaldo());



    }
}