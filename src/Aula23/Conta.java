package Aula23;

import java.io.Serializable;
import java.util.Random;

public class Conta implements Serializable {
    String titular;
    String identificador;
    String senha;
    float saldo;

    public Conta(String titular, String senha, float saldo){
        geraIdentificador();
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
    }
    public Conta(String titular){
        geraIdentificador();
        this.titular = titular;
    }

    void geraIdentificador(){
        String texto = "";
        for(int i=0;i<4;i++){
            texto+=(char) new Random().nextInt(65,91);
        }
        int valor = new Random().nextInt(1000,10000);
        identificador = texto+valor;
    }

    void depositar(float saldo){
        this.saldo+=saldo;
    }

    boolean sacar(float valor){
        if(valor<=saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }

    String verificaSaldo(){
        return "Saldo atual R$ "+String.format("%.2f",saldo);
    }
}