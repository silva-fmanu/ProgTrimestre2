package Aula22.ExemploPolimorfismo.overload;

import Aula22.ExemploPolimorfismo.overload.Operacoes;

//metodos com mesmo nome e comportamento diferentes dependendo dos parametros que manda
public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("Somando dois numeros: "+op.soma(3,2));
        System.out.println("Somando três numeros: "+op.soma(3,2,5));
        System.out.println("Somando strings: "+op.soma("Jonas", "Silva"));
    }
}
