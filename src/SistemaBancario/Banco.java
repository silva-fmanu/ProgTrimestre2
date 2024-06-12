package SistemaBancario;

import java.util.Scanner;

public class Banco {
    public static Conta cadastroConta(){
        Scanner ler = new Scanner(System.in);
        Conta c1 = new Conta();
        System.out.println("Informe o nome do titular da conta:");
        c1.titular = ler.nextLine();
        System.out.print("O identificador da conta é: ");
        c1.gerarIdentificador();
        System.out.println(c1.identificador);
        System.out.println("Informe seu saldo:");
        c1.saldo = ler.nextFloat();
        System.out.println("Crie uma senha para a conta:");
        c1.senha = ler.nextInt();
        return c1;
    }

    public static void mostrarDados(Conta c1){
        System.out.println("Titular: " + c1.titular);
        System.out.println("Identificador: " + c1.identificador);
        System.out.println(c1.verificarSaldo());
    }

    public static Conta buscarContaPorIdentificador(Conta[] contas, int identificador, int numConta) {
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
                    int identificar = ler.nextInt();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println(conta.verificarSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 'd') {
                if (numConta > 0) {
                    System.out.println("Informe o identificador da conta:");
                    int identificar = ler.nextInt();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Insira o valor que deseja depositar:");
                        float valor = ler.nextFloat();
                        conta.depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                } else {
                    System.out.println("Nenhuma conta cadastrada!");
                }
            } else if (resp == 's') {
                if (numConta > 0) {
                    System.out.println("Informe o identificador da conta:");
                    int identificar = ler.nextInt();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Insira o valor que deseja sacar:");
                        float valor = ler.nextFloat();
                        conta.sacar(valor);
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
                    int identificar = ler.nextInt();
                    Conta conta = buscarContaPorIdentificador(contas, identificar, numConta);
                    if (conta != null) {
                        System.out.println("Informe sua senha:");
                        int verificarSenha = ler.nextInt();
                        if (verificarSenha == conta.senha) {
                            mostrarDados(conta);
                        } else {
                            System.out.println("Senha incorreta");
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
