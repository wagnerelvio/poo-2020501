//a) Exceções, Classes Abstratas e Interfaces

// Interface
interface Operacao {
    int executar(int a, int b);
}

// Classe abstrata
abstract class Calculadora {
    abstract int calcular(int a, int b);
}

// Implementação concreta
class Soma extends Calculadora implements Operacao {
    public int calcular(int a, int b) {
        return a + b;
    }
    
    public int executar(int a, int b) {
        return calcular(a, b);
    }
}

// Uso com exceção
public class Principal {
    public static void main(String[] args) {
        try {
            Operacao op = new Soma();
            System.out.println("Resultado: " + op.executar(5, 3));
        } catch (Exception e) {
            System.out.println("Erro ao executar operação.");
        }
    }
}
