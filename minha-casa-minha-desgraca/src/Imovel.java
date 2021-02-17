public class Imovel {

    private String endereco;
    private double valor;
    private UnidadeFederativa estado;

    public Imovel(String endereco, double valor, UnidadeFederativa estado) {
        this.endereco = endereco;
        this.valor = valor;
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

    public String apresentacao(){
        return "Imóvel localizado no endereço " + endereco + ". Valor: R$ " + valor;
    }
}
