package Aula22.ExemploPolimorfismo.override;

public class Aluno extends Pessoa {
    //tudo de Pesso
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override //muda o comportamento de uma classe herdada, esse @ é só ideal mas não muda nada
    public String obterDados() { //tem que ser public para eu conseguir acessar
        return "Nome: "+getNome()+" "+getSobrenome()+", Matricula: "+matricula;
    } // se comporta de um jeito com Pessoa e outro com Aluno
}
//@overload tem que ter ou a quantidade de parametros diferentes ou o tipo de parametro diferente