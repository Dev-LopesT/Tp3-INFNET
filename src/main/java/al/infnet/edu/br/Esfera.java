package al.infnet.edu.br;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}
