package Aula21.Exercicio1;

import java.util.Random;

public class    Conta {
    private String titular;
    private String identificador;
    private String senha;
    protected float saldo;

    Conta(String titular, String senha, float saldo) {
        this.titular=titular;
        this.senha = senha;
        gerarIdentificador();
    }

    void depositar(float valor) {
        saldo+=valor;
    }

    boolean saque(float valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    private void gerarIdentificador() {
        Random aleatorio = new Random();
        String identificador = "";
        for (int i = 0; i < 4; i++) {
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador = identificador;
    }

    public String getIdentificador() {

        return identificador;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    boolean validaAcesso(String identificador, String senha) {
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String verificaSaldo() {
        return String.format("Seu saldo é de R$%.2f", saldo);
    }
}
