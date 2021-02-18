public class Casa extends Imovel{
    protected String patio;

    public Casa(Endereco endereco, double valor, String patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    @Override
    public String apresentacao(){
        return super.apresentacao() +  ". Imóvel: Casa," + " pátio: " + patio ;
    }
}
