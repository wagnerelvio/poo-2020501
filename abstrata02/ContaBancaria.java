public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular não pode ser nulo ou vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean validaConta() {
        return titular != null && !titular.trim().isEmpty() && saldo >= 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public abstract void sacar(double valor);
}
