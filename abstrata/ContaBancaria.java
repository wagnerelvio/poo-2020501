package abstrata;

// Classe abstrata
abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$ " + saldo);
    }

    public abstract void sacar(double valor);

    public boolean transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + destino.titular + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }
}





