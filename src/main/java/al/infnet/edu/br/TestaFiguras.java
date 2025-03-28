package al.infnet.edu.br;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        System.out.println("Área do Círculo (raio = " + circulo.getRaio() + "): " + circulo.calcularArea());

        Esfera esfera = new Esfera(5.0);
        System.out.println("Volume da Esfera (raio = " + esfera.getRaio() + "): " + esfera.calcularVolume());
    }
}
