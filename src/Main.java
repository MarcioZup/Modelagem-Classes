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




    }
}
