public class ContaCorrente extends ContaBancaria {
    private double taxaSaque = 2.50;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double total = valor + taxaSaque;
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (total > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        saldo -= total;
        System.out.println("Saque de R$ " + valor + " com taxa de R$ " + taxaSaque + " realizado.");
    }
}
