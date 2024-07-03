package Aula20.ExemploEncapsulamento;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenime(String sobrenime) {
        this.sobrenome = sobrenime;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
//    alt inser ou botão direito generate (coloca constructor, get, set...)
}
