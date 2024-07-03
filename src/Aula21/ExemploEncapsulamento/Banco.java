package Aula21.ExemploEncapsulamento;

public class Banco {
    public static void main(String[] args) {
        Conta c1= new Conta("Jonas", "123321");
        System.out.println("Identificador " +c1.getIdentificador());
        c1.depositar(200);
        if(c1.sacar(20)){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(c1.verificaSaldo());
    }
}

// proteger de acesso que não devem ser feitos, alterando o atibuto do método indiretamente
