package Atividade1;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    Boolean estaLigada=false;

    void ligar(){
        estaLigada=true;
    }

    void desligar(){
        estaLigada=false;
    }
    Boolean ligada(boolean ligada){
        return estaLigada;
    }
}
