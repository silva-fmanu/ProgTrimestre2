package Aula19.Exemplo;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();

        pessoaUm.nome= "Jonas";
        pessoaUm.sobrenome= "Silva";
        pessoaUm.altura= 170;
        pessoaUm.corOlhos= "verde";
        pessoaUm.dataNascimento= "15-05-2024";
        pessoaUm.andar();
        pessoaUm.correr();

        Pessoa pessoaDois = new Pessoa();

        pessoaDois.nome= "Rafa";
        pessoaDois.sobrenome= "Farias";
        pessoaDois.altura= 155;
        pessoaDois.corOlhos= "azul";
        pessoaDois.dataNascimento= "15-05-2024";
        pessoaDois.andar();
        pessoaDois.correr();

        System.out.println("A pessoa um chama "+pessoaDois.nome+" "+pessoaDois.sobrenome);
    }

}
