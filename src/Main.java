import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        //Instanciando classe Heroi e invocando métodos
        Heroi heroi1 = new Heroi("Batman", 1000);

        System.out.println(heroi1.getNome());
        heroi1.trocarNome("Homem-Aranha");
        System.out.println(heroi1.getNome());
        System.out.println(heroi1.exibirVida());
        heroi1.receberDano(350);
        System.out.println(heroi1.exibirVida());


        //instanciando classe Magos e invocando métodos

        Magos mago1 = new Magos("Merlin", 1000, 250);
        System.out.println(mago1.getVida());
        mago1.aplicarMagia();
        System.out.println(mago1.getPoderMagico());
        System.out.println(mago1.getNome());
        mago1.trocarNome("Dumbledore");
        System.out.println(mago1.getNome());
        System.out.println(mago1.exibirVida());

        //instanciando classe Guerreiros e invocando métodos

        Guerreiros guerreiro1 = new Guerreiros("Conan", 900, 380);
        System.out.println(guerreiro1.getVida());
        guerreiro1.aplicarDano();
        System.out.println(guerreiro1.getNome());
        mago1.trocarNome("Coisa");
        System.out.println(guerreiro1.getNome());
        System.out.println(guerreiro1.exibirVida());
        guerreiro1.receberDano(125);
        System.out.println(guerreiro1.exibirVida());

        //instanciando classe Inimigos e invocando métodos

        Inimigos inimigo1 = new Inimigos("Esqueleto", 500);

        System.out.println(inimigo1.getNome());
        inimigo1.trocarNome("Coringa");
        System.out.println(inimigo1.getNome());
        System.out.println(inimigo1.exibirVida());
        inimigo1.receberDano(guerreiro1.aplicarDano());
        System.out.println(inimigo1.exibirVida());

        //instanciando classe Rasteiros e invocando métodos

        Rasteiros rasteiro1 = new Rasteiros("Escamoso", 750, 130);
        System.out.println(rasteiro1.getVida());
        rasteiro1.aplicarDano();
        System.out.println(rasteiro1.getNome());
        mago1.trocarNome("Lagarto");
        System.out.println(rasteiro1.getNome());
        System.out.println(rasteiro1.exibirVida());
        rasteiro1.receberDano(guerreiro1.aplicarDano());
        System.out.println(rasteiro1.exibirVida());

        //instanciando classe Voadores e invocando métodos

        Voadores voador1 = new Voadores("Gaviao", 1200, 80);
        System.out.println(voador1.getVida());
        voador1.aplicarDano();
        System.out.println(voador1.getNome());
        mago1.trocarNome("Corvo Negro");
        System.out.println(voador1.getNome());
        System.out.println(voador1.exibirVida());
        voador1.receberDano(guerreiro1.aplicarDano());
        System.out.println(voador1.exibirVida());










    }
}
