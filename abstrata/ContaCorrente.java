package abstrata;

//Conta Corrente
class ContaCorrente extends ContaBancaria {
 private double taxaSaque = 2.50;

 public ContaCorrente(String titular, double saldoInicial) {
     super(titular, saldoInicial);
 }

 @Override
 public void sacar(double valor) {
     double total = valor + taxaSaque;
     if (total <= saldo) {
         saldo -= total;
         System.out.println("Saque de R$ " + valor + " com taxa de R$ " + taxaSaque + " realizado.");
     } else {
         System.out.println("Saldo insuficiente para saque.");
     }
 }
}
