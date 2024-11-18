package Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quizz {
    private List<Pergunta> perguntas = new ArrayList<>();

    public void adicionarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            String[] alternativas = pergunta.getAlternativas();
            for (int i = 0; i < alternativas.length; i++) {
                System.out.println((i + 1) + ". " + alternativas[i]);
            }

            System.out.print("Escolha a alternativa correta: ");
            int resposta = scanner.nextInt() - 1; // Ajuste para 0 baseado no índice da array

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta.");
            }
        }

        System.out.println("\nVocê acertou " + pontuacao + " de " + perguntas.size() + " perguntas.");
    }
}

