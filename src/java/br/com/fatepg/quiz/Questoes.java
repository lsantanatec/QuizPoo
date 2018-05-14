package br.com.fatepg.quiz;

public class Questoes {

    private String questao;
    private String resposta;
    private String[] alternativas;

    public Questoes(String questao, String resposta, String[] alternativas) {
        this.questao = questao;
        this.resposta = resposta;
        this.alternativas = alternativas;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }
    
    public int[] randomizer() {
        int[] conf = new int[10];
        int t = 0;
        int dif = 0;

        for (int a = 0; a < conf.length; a++) {
            conf[a] = (int) (Math.random() * 100);
            if (conf[a] > 29) {
                t = conf[a];
                dif = t - 29;
                dif += a;
                conf[a] -= dif;
            }
            for (int b = 1; b < 9; b++) {
                if (a == b) {
                    continue;
                }
                if (conf[a] > 29) {
                    t = conf[a];
                    dif = t - 29;
                    dif += a;
                    conf[a] -= dif;
                }
                if (conf[a] == conf[b]) {
                    conf[a] = (int) (Math.random() * 100);
                    b = 0;
                }
            }
        }

        for (int a = 0; a < conf.length; a++) {
            for (int b = 1; b < 9; b++) {
                if (a == b) {
                    continue;
                }

                if (conf[a] == conf[b]) {
                    conf[a] = +1;
                    b = 1;

                }
            }
        }
        return conf;
        
    }

}
