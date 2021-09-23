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



    }
}
