package Aula21.Exercicio1;

public class ContaCorrente extends Conta{
    public ContaCorrente (String titular, String senha, float limite){
        super(titular, senha);
    }

    private float limite;
    public boolean sacar(float valor) {
        if(saldo+limite>=valor) {
            if(saldo-valor<0) {
                float exedente = saldo -= valor;
                limite -= exedente;
            }
            return true;
        }else{
            return false;
        }
    }

    public String verificaSaldo() {
        return String.format("Seu saldo é de R$%.2f seu limite é", saldo, limite);
    }

}
