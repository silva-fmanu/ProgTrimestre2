package Aula20.ExemploHerranca;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Jonas");
        f1.setSobrenome("Silva");
        f1.setSalario(1500);

        Motorista m1 =new Motorista();
        m1.setNome("Motorista1");
        m1.setSobrenome("Soarez");
        m1.setSalario(4000);
        m1.setCnh("numCnh7");
    }
}
