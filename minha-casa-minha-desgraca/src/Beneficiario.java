public class Beneficiario {
    private String nome;
    private Double salario;

    public Beneficiario(String nomeBeneficiario, Double salarioBeneficiario) {
        this.nome = nomeBeneficiario;
        this.salario = salarioBeneficiario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
}
