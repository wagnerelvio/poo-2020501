public class BancoApp {
    public static void main(String[] args) {
        try {
            ContaCorrente cc = new ContaCorrente("João", 1000.0);
            if (cc.validaConta()) {
                cc.depositar(500.0);
                cc.sacar(200.0);
            }

            ContaPoupanca cp = new ContaPoupanca("Maria", 1500.0);
            if (cp.validaConta()) {
                cp.depositar(300.0);
                cp.sacar(100.0);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
