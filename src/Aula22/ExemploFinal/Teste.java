package Aula22.ExemploFinal;

public class Teste {
    public static void main(String[] args) {
        System.out.println(Operacoes.PI);//constante consegue acessar direto
        Operacoes op = new Operacoes();
        System.out.println(op.pi);//tem que  criar a estancia
        //op.pi=3.14; Não da para alterar o valor de um atribto final
    }
}
