public class Rasteiros extends Inimigos {

    private double danoEspinhos;

    public double aplicarDano(){
        return danoEspinhos;
    }

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

}
