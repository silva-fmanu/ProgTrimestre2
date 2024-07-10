package Aula22.ExemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static int lerInteiro(){
        Scanner ler = new Scanner(System.in);
        int num=0;
        boolean valido;
        do {
            try {
                System.out.println("Digite um número: ");
                int n1 = ler.nextInt();
                valido = true;
                System.out.println("Digite outro número: ");
                int n2 = ler.nextInt();
                int resposta = n1/n2;
                System.out.println(resposta);
            }
            catch(InputMismatchException erro){
                System.out.println("O valor deve ser um numero!!");
                valido = false;
                ler.next();
            }
        }while(!valido);
        return num;
    }
    public static void main(String[] args) {
        lerInteiro();
    }
}
