package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;
import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrenteNU = new ContaCorrente(new Conta(12323,34313d,
                TipoConta.CONTA_CORRENTE,
                InstituicaoBancaria.NUBANK));


        contaCorrenteNU.depositar(23233d);
        contaCorrenteNU.consultarSaldo();
        contaCorrenteNU.sacar(700d);
        contaCorrenteNU.getInstituicaoBancaria();


    }
}