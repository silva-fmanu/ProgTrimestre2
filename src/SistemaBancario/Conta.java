package SistemaBancario;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    float saldo;

    int senha;


    void gerarIdentificador(){
        int letra=(char) new Random().nextInt(65,91);
        int valor=new Random().nextInt(1000,100000);
        identificador=letra+""+valor;
    }

    void depositar(float valor){
        saldo+=valor;
    }

    boolean sacar(float valor){
        if(saldo>valor){
            saldo-=valor;
            return true;
        }
        else{
            return false;
        }
    }

    String verificarSaldo(){
        return "Seu saldo atual é de R$"+saldo;
    }

//    Conta(String titular, float ){
//
//    }
}
