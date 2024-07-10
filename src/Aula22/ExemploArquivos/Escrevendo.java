package Aula22.ExemploArquivos;
import java.io.*;
//sempre da para lidar com arquivos
public class Escrevendo {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\manuf.LAPTOP-PDNRVEOT\\Pictures\\a");
        if(caminho.exists()){
            System.out.println("O caminho existe");
        }else{
            System.out.println("O caminho não existe, tentando criar...");
            caminho.mkdirs();// cria a arvore inteira
        }
        //tentando escrever um pessoa em um arquivo
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        File arquivo = new File(caminho, "dadosPessoais.db");
        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();
            System.out.println("Salvo com sucesso!");
        }
        catch (FileNotFoundException e){
            System.out.println("Erro ao ler o arquivo");
        }
        catch (IOException e){
            System.out.println("Erro ao gravar informações");
        }
    }
}
