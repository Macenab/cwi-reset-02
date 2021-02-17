public enum UnidadeFederativa {

    MATO_GROSSO_DO_SUL_MS("Mato Grosso do Sul MS"),
    MINAS_GERAIS_MG("Minas Gerais MG"),
    PARA_PA("Pará PA"),
    PARAIBA_PB("Paraíba PB");


    private String estado;

    UnidadeFederativa(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
