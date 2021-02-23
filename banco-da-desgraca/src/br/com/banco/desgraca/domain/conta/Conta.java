package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;

public  class Conta{

    private int numeroDaConta;
    private double saldoDaConta;
    private InstituicaoBancaria instituicaoBancaria;


    public Conta(int numeroDaConta, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;

    }

        public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
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

    public void setInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }
}
