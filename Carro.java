package operadores;

public class Carro {
    // Atributos da classe
    private String tipoDoCarro;
    private String modelo;
    private int ano;
    private double preco;
    private double capacidadeTanque; // em litros
    private double consumoCombustivelPorKm; // em km por litro

    // Construtor
    public Carro(String tipoDoCarro, String modelo, int ano, double preco, double capacidadeTanque, double consumoCombustivelPorKm) {
        this.tipoDoCarro = tipoDoCarro;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoCombustivelPorKm = consumoCombustivelPorKm;
    }

    // Método para calcular autonomia
    public double calcularAutonomia() {
        return capacidadeTanque * consumoCombustivelPorKm;
    }

    // Método para exibir as informações do carro e sua autonomia
    public void exibirInformacoes() {
        System.out.println("Tipo do Carro: " + tipoDoCarro);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        //System.out.println("Preço: R$" + preco);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + " litros");
        System.out.println("Consumo de Combustível: " + consumoCombustivelPorKm + " km/l");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }
 public void precoCarro() {
	   System.out.println("Preço: R$" + preco);
 }
    
    
    // Método main para testar a classe
    public static void main(String[] args) {
        Carro meuCarro = new Carro("SUV", "Honda HR-V", 2022, 120000.00, 50, 12);
        meuCarro.exibirInformacoes();
    }
}
