package entities;

public class ClasseGenerica {

    String nome;

    public ClasseGenerica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double area(){

    }
}
