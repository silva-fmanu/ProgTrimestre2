package Atividade2;

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static Aluno cadastraAluno() {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Informe o nome do aluno:");
        String nome = ler.next();
        System.out.println("Informe o sobrenome do aluno:");
        String sobrenome = ler.next();
        System.out.println("Informe o email do aluno:");
        String eMail = ler.next();
        int codigo = new Random().nextInt(1000, 10000000);
        a1.nome = nome;
        a1.sobrenome = sobrenome;
        a1.eMail = eMail;
        a1.codigo = codigo;
        return a1;
    }

public static void mostraAluno(Aluno a1){
    System.out.println("Nome: " + a1.nome + " " + a1.sobrenome);
    System.out.println("eMail: " + a1.eMail);
    System.out.println("Código: " + a1.codigo);
    System.out.println("Média: " + a1.media(a1.notaUm, a1.notaDois));
    System.out.println("Está " + a1.alunoaprovado(a1.media(a1.notaUm, a1.notaDois)));
}
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno[] turma = new Aluno[10];
        int contAluno = 0;
        char resp;
        boolean existe = false;
        int posiAluno = 0;
        String nome="", sobrenome="", eMail="";

        do {
            System.out.println("c- cadastro aluno");
            System.out.println("l- listar alunos");
            System.out.println("p- pesquisar aluno");
            System.out.println("s- sair");
            resp = ler.next().toLowerCase().charAt(0);

            if (resp == 'c') {
                if (contAluno < turma.length) {
                    turma[contAluno] = cadastraAluno();
                    System.out.println("Aluno " + nome + " " + sobrenome + " cadastrado obteve o código " + turma[contAluno].codigo);
                    System.out.println("Qual é a primeira nota do Aluno " + nome + "?");
                    turma[contAluno].notaUm = ler.nextFloat();
                    System.out.println("Qual é a segunda nota?");
                    turma[contAluno].notaUm = ler.nextFloat();
                    contAluno++;

                }
            } else if (resp == 'l') {
                if (contAluno < turma.length) {
                    for (int i = 0; i < contAluno; i++) {
                        mostraAluno(turma[i]);
                        System.out.println("-------------------------------");
                    }
                }

            } else if (resp == 'p') {
                if (contAluno < turma.length) {
                    System.out.println("Qual é o código da matrícula?");
                    int matricula = ler.nextInt();

                    for (int i = 0; i < contAluno; i++) {
                        if (matricula == turma[i].codigo) {
                            existe = true;
                            posiAluno = i;
                            i = contAluno;
                        } else {
                            i++;
                        }
                    }

                    if (existe) {
                        mostraAluno(turma[posiAluno]);
                    } else {
                        System.out.println("Não existe um aluno cadastrado com o código " + matricula);
                    }


                }
            }
        } while (resp != 's');
    }
}
