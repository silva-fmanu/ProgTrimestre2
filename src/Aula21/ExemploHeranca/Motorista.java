package Aula21.ExemploHeranca;

public class Motorista extends Funcionario{
    public Motorista(String nome, String sobrenome){
        super (nome, sobrenome);
    }
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
