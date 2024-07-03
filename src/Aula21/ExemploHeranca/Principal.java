package Aula21.ExemploHeranca;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Jonas", "Silva");//com construtor
        /*m1.setNome("Jonas"); sem construtor
        m1.setSobrenome("Silva");*/
        m1.setSalario(1000);
        m1.setCnh("1234567");

        Engenheiro e1= new Engenheiro("Jonas", "Silva");
        e1.setSalario(2500);
        e1.setCrea("1234567");
    }
}
