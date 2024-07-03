package Aula21.Exercicio1;

import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    protected float saldo;

    Conta(String titular, String senha) {
        this.titular=titular;
        this.senha = senha;
        gerarIdentificador();
    }

    void depositar(float valor) {
        saldo+=valor;
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
}
