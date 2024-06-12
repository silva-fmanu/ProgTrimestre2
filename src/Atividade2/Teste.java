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


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno[] turma = new Aluno[10];
        int contAluno = 0;
        char resp;
        boolean existe = false;
        int posiAluno = 0;
        String nome="", sobrenome="", eMail="";
        int codigo=0;

        do {
            System.out.println("c- cadastro aluno");
            System.out.println("l- listar alunos");
            System.out.println("p- pesquisar aluno");
            System.out.println("s- sair");
            resp = ler.next().toLowerCase().charAt(0);

            if (resp == 'c') {
                if (contAluno < turma.length) {
                    turma[contAluno] = cadastraAluno();
                    System.out.println("Aluno " + nome + " " + sobrenome + " cadastrado obteve o código " + codigo);
                    System.out.println("Qual é a primeira nota do Aluno " + nome + "?");
                    turma[contAluno].notaUm = ler.nextFloat();
                    System.out.println("Qual é a segunda nota?");
                    turma[contAluno].notaUm = ler.nextFloat();
                    contAluno++;

                }
            } else if (resp == 'l') {
                if (contAluno < turma.length) {
                    for (int i = 0; i < contAluno; i++) {
                        System.out.println("Nome: " + turma[i].nome + " " + turma[i].sobrenome);
                        System.out.println("eMail: " + turma[i].eMail);
                        System.out.println("Código: " + turma[i].codigo);
                        System.out.println("Média: " + turma[i].media(turma[i].notaUm, turma[i].notaDois));
                        System.out.println("Está " + turma[i].alunoaprovado(turma[i].media(turma[i].notaUm, turma[i].notaDois)));
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
                        System.out.println("Nome: " + turma[posiAluno].nome + " " + turma[posiAluno].sobrenome);
                        System.out.println("Código: " + turma[
                                posiAluno].codigo);
                        System.out.println("Média: " + turma[posiAluno].media(turma[posiAluno].notaUm, turma[posiAluno].notaDois));
                        System.out.println("Está " + turma[posiAluno].alunoaprovado(turma[posiAluno].media(turma[posiAluno].notaUm, turma[posiAluno].notaDois)));
                    } else {
                        System.out.println("Não existe um aluno cadastrado com o código " + matricula);
                    }


                }
            }
        } while (resp != 's');
    }
}
