package Aula22.ExemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        try { //preve o erro, por isso é melhor que usar if
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int n1 = ler.nextInt();
            System.out.println("Digite outro número: ");
            int n2 = ler.nextInt();
            int resposta = n1/n2;
            System.out.println(resposta); //se o usuaario não fizer caca da certo, se ele fizer da exeption
        }
        catch(InputMismatchException erro){
            System.out.println("Os valores precisam ser números!");
            System.out.println(erro);//printa o erro
            erro.printStackTrace();//mostra o erro que o java colocar
        }
        catch(ArithmeticException erro){
            System.out.println("Não é possível dividir por zero!");
            erro.printStackTrace();
        }
        catch(Exception erro){
            System.out.println("Ops!! Algo deu errado");//sempre por ultimo
            erro.printStackTrace();
        }
        finally {
            System.out.println("Sempre sou executado!");
        }

    }

}
