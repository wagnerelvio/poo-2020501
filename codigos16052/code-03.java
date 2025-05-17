// Definição e Uso de Classes Abstratas
abstract class Animal {
    abstract void emitirSom();
    
    void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

class Gato extends Animal {
    void emitirSom() {
        System.out.println("Miau!");
    }
}

public class TesteAnimal {
    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.emitirSom();
        gato.dormir();
    }
}
