package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer numeroDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        if(numeroDeFuncionarios < 11)
            return super.getRendaAnual() * 0.16;
        else
            return super.getRendaAnual() * 0.14;
    }

    @Override
    public String toString() {
        return super.getNome() +
                ": $ " +
                String.format("%.2f", imposto());
    }
}
