public class Casa extends Imovel{
    protected String patio;

    public Casa(Endereco endereco, double valor, String patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public String getPatio() {
        return patio;
    }

    @Override
    public String apresentacao(){
        return super.apresentacao() + " Pátio: " + patio + " Imóvel: Casa ";
    }
}
