package Atividade2;

public class Aluno {
    String nome;
    String sobrenome;
    String eMail;
    int codigo;
    float notaUm;
    float notaDois;

    float media(float n1, float n2){
        return (n1+n2)/2;
    }
    String alunoaprovado(float media){
        if(media >=8){
            return "Aprovado";
        } else if (media>=6) {
            return "Em recuperação";
        } else{
            return "Reprovado";
        }
    }

}
