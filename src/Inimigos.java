public class Inimigos {

    private String nome;
    private double vida;

    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void trocarNome(String nome){
        this.nome = nome;
    }

    public void receberDano(double dano){
        this.vida -= dano;
    }

    public double exibirVida(){
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }


}
