package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.enums.InstituicaoBancaria;
import br.com.banco.desgraca.domain.enums.TipoConta;

public class Conta {

    private int numeroDaConta;
    private double saldoDaConta;
    private TipoConta tipoDaConta;
    private InstituicaoBancaria instituicaoBancaria;


    public Conta(int numeroDaConta, double saldoDaConta, TipoConta tipoDaConta, InstituicaoBancaria instituicaoBancaria) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
        this.tipoDaConta = tipoDaConta;
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public Conta() {
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

    public TipoConta getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(TipoConta tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    public void setInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }
}
