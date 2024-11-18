package Entidades;

public class Pergunta {
    private String pergunta;
    private String[] alternativas;
    private int respostaCorreta;

    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }
}
