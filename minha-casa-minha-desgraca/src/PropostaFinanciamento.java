public class PropostaFinanciamento  {

    private Beneficiario beneficiario;
    private Imovel imovelEscolhido;
    private Integer mesesParaPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelEscolhido, Integer mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovelEscolhido = imovelEscolhido;
        this.mesesParaPagamento = mesesParaPagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */



    public void validarProposta() {
        double regraDeNegocio;

        if (imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.SAO_PAULO_SP){
            regraDeNegocio = (65) / 100;
        } else if (imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.RIO_DE_JANEIRO_RJ) {
            regraDeNegocio = (60) / 100;
        } else {
            regraDeNegocio = (50) / 100;
        }


        if(beneficiario.getSalario() * mesesParaPagamento >= imovelEscolhido.getValor() * regraDeNegocio) {
            imprimirPropostaAprovada();
        } else {
            imprimirPropostaNegada();
        }


    }

    public void imprimirPropostaAprovada(){
        System.out.println("Beneficiário: " + beneficiario);
        System.out.println("Imóvel: " + imovelEscolhido);
        System.out.println("Prazo: " + mesesParaPagamento);
        System.out.println("Parabéns! Sua proposta foi aceita, vamo que vamo!");
    }

    public void imprimirPropostaNegada(){
        System.out.println("Beneficiário: " + beneficiario);
        System.out.println("Imóvel: " + imovelEscolhido);
        System.out.println("Prazo: " + mesesParaPagamento);
        System.out.println("Pô tá até tirando os guri mesmo né, pode dando meia volta meu bacano");

    }
}