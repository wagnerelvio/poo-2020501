//Definição e Tratamento de Exceções

public class TratamentoExcecao {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Gera exceção
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do limite do array.");
        } finally {
            System.out.println("Finalizando o programa.");
        }
    }
}
