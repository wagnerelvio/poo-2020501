// Definição e Uso de Interfaces

interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    double raio;

    Circulo(double r) {
        raio = r;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class TesteForma {
    public static void main(String[] args) {
        Forma circulo = new Circulo(3.0);
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
