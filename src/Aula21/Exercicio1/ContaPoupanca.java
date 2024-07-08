package Aula21.Exercicio1;

public class ContaPoupanca extends Conta{
    ContaPoupanca(String titular, String senha, float saldo){
        super(titular, senha, saldo);
    }

    public boolean sacar(float valor) {
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
}
