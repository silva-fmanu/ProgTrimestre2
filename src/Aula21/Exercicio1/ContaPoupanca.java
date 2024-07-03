package Aula21.Exercicio1;

public class ContaPoupanca extends Conta{
    ContaPoupanca(String titular, String senha, float saldo){
        super(titular, senha);
    }

    public boolean sacar(float valor) {
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    public String verificaSaldo() {
        return String.format("Seu saldo é de R$%.2f", saldo);
    }
}
