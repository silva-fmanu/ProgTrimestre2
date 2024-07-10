package Aula22.ExemploArquivos;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){ //altera o padrão do java
        return "Nome: "+nome+" "+sobrenome;
    }
}
