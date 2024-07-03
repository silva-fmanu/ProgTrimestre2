package Aula19.Atividade1;

public class Teste {
    public static void main(String[] args) {

        System.out.println("LÂMPADA UM");
        Lampada lampadaUm= new Lampada();
        lampadaUm.marca= "Sparkle";
        lampadaUm.modelo= "Comun";
        lampadaUm.cor= "Amarela";
        lampadaUm.ligar();
        System.out.println("A lampada está "+lampadaUm.ligada(lampadaUm.estaLigada));
        lampadaUm.desligar();
        System.out.println("A lampada está "+lampadaUm.ligada(lampadaUm.estaLigada));

        System.out.println("LÂMPADA DOIS");
        Lampada lampadaDois= new Lampada();
        lampadaDois.marca= "Sparkle";
        lampadaDois.modelo= "Pro";
        lampadaDois.cor= "Azul";
        lampadaDois.ligar();
        System.out.println("A lampada está "+lampadaDois.ligada(lampadaDois.estaLigada));
        lampadaDois.desligar();
        System.out.println("A lampada está "+lampadaDois.ligada(lampadaDois.estaLigada));

        System.out.println("LÂMPADA TRÊS");
        Lampada lampadaTres= new Lampada();
        lampadaTres.marca= "Sparkle";
        lampadaTres.modelo= "Intermediário";
        lampadaTres.cor= "Neutra";
        lampadaTres.ligar();
        System.out.println("A lampada está "+lampadaTres.ligada(lampadaTres.estaLigada));
        lampadaTres.desligar();
        System.out.println("A lampada está "+lampadaTres.ligada(lampadaTres.estaLigada));

        System.out.println("LÂMPADA QUATRO");
        Lampada lampadaQuatro= new Lampada();
        lampadaQuatro.marca= "Sparkle";
        lampadaQuatro.modelo= "Inteligente";
        lampadaQuatro.cor= "Colorida";
        lampadaQuatro.ligar();
        System.out.println("A lampada está "+lampadaQuatro.ligada(lampadaQuatro.estaLigada));
        lampadaQuatro.desligar();
        System.out.println("A lampada está "+lampadaQuatro.ligada(lampadaQuatro.estaLigada));

        System.out.println("LÂMPADA CINCO");
        Lampada lampadaCinco= new Lampada();
        lampadaCinco.marca= "Sparkle";
        lampadaCinco.modelo= "Comun";
        lampadaCinco.cor= "Neutra";
        lampadaCinco.ligar();
        System.out.println("A lampada está "+lampadaCinco.ligada(lampadaQuatro.estaLigada));
        lampadaQuatro.desligar();
        System.out.println("A lampada está "+lampadaQuatro.ligada(lampadaQuatro.estaLigada));

    }
}
