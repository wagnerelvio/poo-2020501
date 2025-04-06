package abstrata;


//Conta Poupança
class ContaPoupanca extends ContaBancaria {

 public ContaPoupanca(String titular, double saldoInicial) {
     super(titular, saldoInicial);
 }

 @Override
 public void sacar(double valor) {
     if (valor <= saldo) {
         saldo -= valor;
         System.out.println("Saque de R$ " + valor + " realizado sem taxa.");
     } else {
         System.out.println("Saldo insuficiente para saque.");
     }
 }
}
