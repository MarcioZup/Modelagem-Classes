public class Heroi {
    private String nome;
    private double vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

   public Heroi(String nome, double vida) {
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
}
