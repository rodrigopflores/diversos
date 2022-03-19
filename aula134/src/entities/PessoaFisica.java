package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double imposto() {
        if(super.getRendaAnual() < 20000)
            return super.getRendaAnual() * 0.15 - gastosComSaude * 0.5;
        else
            return super.getRendaAnual() * 0.25 - gastosComSaude * 0.5;
    }

    @Override
    public String toString() {
        return super.getNome() +
                ": $ " +
                String.format("%.2f", imposto());
    }
}
