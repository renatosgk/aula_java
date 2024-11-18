public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            // Criando perguntas para o quiz
            Pergunta p1 = new Pergunta(
                    "Qual das seguintes fontes de energia é renovável?",
                    new String[] {"Petróleo", "Vento", "Carvão", "Gás Natural"},
                    1
            );
            Pergunta p2 = new Pergunta(
                    "Qual das seguintes fontes de energia é não renovável?",
                    new String[] {"Solar", "Hidrelétrica", "Petróleo", "Eólica"},
                    2
            );

            // Criando um quiz e adicionando perguntas
            Quiz quiz = new Quiz();
            quiz.adicionarPergunta(p1);
            quiz.adicionarPergunta(p2);

            // Iniciando o quiz
            quiz.iniciar();

            // Criando e demonstrando energias
            EnergiaRenovavel energiaSolar = new EnergiaRenovavel("Solar", "Energia proveniente da radiação solar.");
            EnergiaNaoRenovavel energiaPetroleo = new EnergiaNaoRenovavel("Petróleo", "Fonte de energia fóssil proveniente de depósitos naturais.");

            energiaSolar.tipoEnergia();
            energiaPetroleo.tipoEnergia();
        }
    }
    }
}