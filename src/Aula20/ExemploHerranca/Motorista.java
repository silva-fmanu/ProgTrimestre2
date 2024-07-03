package Aula20.ExemploHerranca;

public class Motorista extends Funcionario{ //o extend fala que é filho
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
