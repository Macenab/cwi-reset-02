public class PropostaFinanciamento extends Beneficiario{

    public PropostaFinanciamento(String nomeBeneficiario, Double salarioBeneficiario) {
        super(nomeBeneficiario, salarioBeneficiario);
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

    public void imprimirPropostaAprovada(){
        System.out.println("Caro " +  + "");
    }

    public void validarProposta() {

    }
}