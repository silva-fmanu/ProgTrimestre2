package Aula20.ExemploStatic;

import java.util.Scanner;

public class Banco {
    public static Conta cadastroConta(){
//        Scanner ler = new Scanner(System.in);
//        System.out.println("Informe o nome do titular da conta:");
//        String titular = ler.nextLine();
//        System.out.println("Informe seu saldo:");
//        float saldo = ler.nextFloat();
//        System.out.println("Crie uma senha para a conta:");
//        int senha = ler.nextInt();
        Conta c1 = new Conta("Jonas", 1234, 10005000);
        c1.depositar(0);
        System.out.println(c1.verificarSaldo());

//        c1.nomeBanco="Banco Cimol";
//        Conta.nomeBanco="Teste";
//        System.out.println("Identificador da conta:");
//        System.out.println(c1.identificador);
        return c1;

    }

    public static void mostrarDados(Conta c1){
        System.out.println("Titular: " + c1.titular);
        System.out.println("Identificador: " + c1.identificador);
        System.out.println(c1.verificarSaldo());
    }

    public static Conta buscarContaPorIdentificador(Conta[] contas, String identificador, int numConta) {
        for (int i = 0; i < numConta; i++) {
            if (contas[i].identificador.equals(identificador)) {
                return contas[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta[] contas = new Conta[10];
        int numConta = 0;
        char resp;

        do {
            System.out.println("c- cadastro");
            System.out.println("v- verificar saldo");
            System.out.println("d- depositar valor");
            System.out.println("s- sacar");
            System.out.println("l- listar contas");
            System.out.println("e- entrar na conta");
            System.out.println("q- sair");
            resp = ler.next().toLowerCase().charAt(0);

            if (resp == 'c') {
                if (numConta < contas.length) {
                    contas[numConta] = cadastroConta();
                    numConta++;
                } else {
                    System.out.println("Limite de contas atingido!");
                }
            } else if (resp == 'v') {
                if (numConta > 0) {
                    System.out.println("Informe o identificador da conta:");
                    String identificar = ler.next();
                    Conta conta = buscarContaPorIdentificador(contas, String.valueOf(identificar), numConta);
                    if (conta != null) {
                        System.out.println("Informe sua senha:");
                        int verificarSenha = ler.nextInt();
                        if (verificarSenha == conta.senha) {
                            System.out.println(conta.verificarSaldo());
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 'd') {
                if (numConta > 0) {
                    System.out.println("Informe o identificador da conta:");
                    String identificar = ler.next();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Informe sua senha:");
                        int verificarSenha = ler.nextInt();
                        if (verificarSenha == conta.senha) {
                            System.out.println("Insira o valor que deseja depositar:");
                            float valor = ler.nextFloat();
                            conta.depositar(valor);
                            System.out.println("Deposito de "+valor+" efetuado com sucesso!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 's') {
                if (numConta > 0) {
                    System.out.println("Informe o identificador da conta:");
                    String identificar = ler.next();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Informe sua senha:");
                        int verificarSenha = ler.nextInt();
                        if (verificarSenha == conta.senha) {
                            System.out.println("Insira o valor que deseja sacar:");
                            float valor = ler.nextFloat();
                            if(valor>conta.saldo){
                                System.out.println("Saldo insuficiente!");
                            } else{
                                conta.sacar(valor);
                                System.out.println("Saque efetuado com sucesso!");
                            }
                        } else {
                            System.out.println("Senha incorreta");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 'l') {
                if (numConta > 0) {
                    for (int i = 0; i < numConta; i++) {
                        mostrarDados(contas[i]);
                        System.out.println("-------------------------------");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 'e') {
                if (numConta > 0) {
                    System.out.println("Qual é o identificador da conta?");
                    String identificar = ler.next();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Informe sua senha:");
                        int verificarSenha = ler.nextInt();
                        if (verificarSenha == conta.senha) {
                            mostrarDados(conta);
                            System.out.println("Deseja editar sua senha? (s-para sim, n-para não");
                            char opc= ler.next().toLowerCase().charAt(0);
                            for (int i = 0; i < 1; i++) {
                                switch (opc){
                                    case 's'->{
                                        System.out.println("Digite sua nova senha:");
                                        conta.senha=ler.nextInt();
                                    }
                                    case 'n'->{
                                        System.out.println("saindo...");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Senha incorreta!");
                        }
                    } else {
                        System.out.println("Conta não encontrada com o identificador " + identificar);
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 'q') {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (resp != 'q');
    }
}
