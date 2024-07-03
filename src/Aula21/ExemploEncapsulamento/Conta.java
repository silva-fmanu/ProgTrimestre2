package Aula21.ExemploEncapsulamento;

import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    private float saldo;

    Conta(String titular, String senha) {
        this.titular=titular;
        this.senha = senha;
        gerarIdentificador();
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

    public String verificaSaldo() {
        return String.format("Seu saldo é de R$%.2f", saldo);
    }

    void depositar(float valor) {
        saldo+=valor;
    }

    boolean sacar(float valor) {
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    boolean validaAcesso(String identificador, String senha) {
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }

    public String getIdentificador() {

        return identificador;
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {

        this.saldo = saldo;
    }
}
