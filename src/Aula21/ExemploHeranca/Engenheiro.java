package Aula21.ExemploHeranca;

public class Engenheiro extends Funcionario{
    public Engenheiro (String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    private String crea;
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
