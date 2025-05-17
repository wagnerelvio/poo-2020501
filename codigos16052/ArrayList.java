import java.util.ArrayList;

public class CadastroAlunos {
    public static void main(String[] args) {
        // Criando uma lista de alunos
        ArrayList<String> alunos = new ArrayList<>();

        // Adicionando alunos
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");
        alunos.add("Daniela");

        // Exibindo todos os alunos
        System.out.println("Lista de Alunos:");
        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }

        // Verificando se um nome está na lista
        if (alunos.contains("Carlos")) {
            System.out.println("\nCarlos está na lista.");
        }

        // Removendo um aluno
        alunos.remove("Ana");
        System.out.println("\nApós remover 'Ana':");
        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }

        // Tamanho da lista
        System.out.println("\nTotal de alunos cadastrados: " + alunos.size());
    }
}
