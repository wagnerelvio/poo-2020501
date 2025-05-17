// Coleções e Arquivos
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class ListaEArquivo {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        // Exibir nomes
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // Escrever em arquivo
        try {
            FileWriter writer = new FileWriter("nomes.txt");
            for (String nome : nomes) {
                writer.write(nome + "\n");
            }
            writer.close();
            System.out.println("Arquivo escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
    }
}
