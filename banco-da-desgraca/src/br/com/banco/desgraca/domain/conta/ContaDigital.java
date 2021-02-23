package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

import java.time.LocalDate;

public class ContaDigital extends Conta implements ContaBancaria {

    private InstituicaoBancaria instituicaoBancaria;
    private TipoConta tipoDeConta;

    public ContaDigital(int numeroDaConta, double saldoDaConta, InstituicaoBancaria instituicaoBancaria, TipoConta tipoDeConta) {
        super(numeroDaConta, saldoDaConta);
        this.instituicaoBancaria = instituicaoBancaria;
        this.tipoDeConta = tipoDeConta;
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
        return this.getSaldoDaConta() ;
    }

    @Override
    public void depositar(Double valor) {
    }

    @Override
    public void sacar(Double valor) {

        if (valor <= 10.00) {
            throw new RuntimeException("O valor a ser sacado necessita ser maior que R$10,00.");
        } else if (valor >= getSaldoDaConta()) {
            throw new RuntimeException("O valor a ser sacado excede o saldo atual da conta.");
        } else {
            System.out.println("O valor a ser sacado é: " + valor);
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }
}
