package br.com.banco.desgraca.domain.enums;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL("Banco do Brasil 788"),
    BRADESCO("Bradesco 453"),
    CAIXA("Caixa Econômica Federal 873"),
    ITAU("Unibanco Itaú 746"),
    NUBANK("Nubank 123");

    private String instituicaoBancaria;


    InstituicaoBancaria(String instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public String getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    public String toString() {
        return String.format(getInstituicaoBancaria());
    }

}