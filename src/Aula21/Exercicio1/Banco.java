package Aula21.Exercicio1;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp = ' ';
        String senha= " ";
        String identificador= " ";
        Conta c1 = new Conta("Manuela", "12345", 1200);
        ContaCorrente cc1 = new ContaCorrente("Julia", "1234", 2000, 5000);
        ContaPoupanca cp1 = new ContaPoupanca("Renato", "12345", 5000);
        do {
            System.out.println("Insira -c para cadastrar uma conta");
            System.out.println("Insira -l para listar as contas");
            System.out.println("Insira -e para entrar na sua conta");
            System.out.println("Insira -q para sair");
            resp = ler.next().toLowerCase().charAt(0);

            switch (resp){
                case 'c' -> {
                    do {
                        System.out.println("Insira");
                        System.out.println("a- para cadastrar conta");
                        System.out.println("b- para cadastrar conta corrente");
                        System.out.println("c- para cadastrar conta poupança");
                        System.out.println("s - para sair");
                        resp = ler.next().toLowerCase().charAt(0);
                        switch (resp){
                            case 'a' ->{
                                System.out.println("Identificador: "+c1.getIdentificador());
                            }
                            case 'b' ->{
                               System.out.println("Identificador: "+cc1.getIdentificador());
                            }
                            case 'c' ->{
                                System.out.println("Identificador: "+cp1.getIdentificador());
                            }
                        }
                    }while(resp!='s');

                }
                case 'l' -> {
                    System.out.println("Contas:");
                    System.out.println("Titular: "+c1.getTitular());
                    System.out.println("------------------------------------------------");
                    System.out.println("Contas Correntes:");
                    System.out.println("Titular: "+cc1.getTitular());
                    System.out.println("------------------------------------------------");
                    System.out.println("Contas Poupança:");
                    System.out.println("Titular: "+cp1.getTitular());
                    System.out.println();
                }
                case 'e' -> {
                    System.out.println("Insira seu identificador:");
                    identificador = ler.next();
                    System.out.println("Insira sua senha:");
                    senha = ler.next();
                    if(c1.validaAcesso(identificador, senha)){
                        System.out.println(c1.getTitular());
                        c1.verificaSaldo();
                        do{
                            System.out.println("a- para sacar");
                            System.out.println("b- para depositar");
                            System.out.println("c- varificar saldo");
                            System.out.println("q - para sair");
                            resp = ler.next().toLowerCase().charAt(0);
                            switch (resp){
                                case 'a' ->{
                                    System.out.println("Informe o valor que deseja sacar:");
                                    float valor = ler.nextFloat();
                                    if(c1.saque(valor)==true){
                                        System.out.println("Saque efetuado com sucesso");
                                    } else{
                                        System.out.println("Saldo insuficiente");
                                    }
                                }
                                case 'b' ->{
                                    System.out.println("Informe o valor que deseja depositar:");
                                    float valor = ler.nextFloat();
                                    c1.depositar(valor);
                                }
                                case 'c' ->{
                                    System.out.println(c1.verificaSaldo());
                                }
                            }
                        }while(resp!='q');
                    } else{
                        System.out.println("ERRO! Tente novamente!");
                    }

                }
            }
        }while(resp!='q');
    }
}
