/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatepg.quiz;

/**
 *
 * @author a
 */
public class Questoes {
    private String questao;
    private String resposta;
    private String[] alternativas;

    public Questoes(String questao, String resposta, String[] alternativas) {
        this.questao = questao;
        this.resposta = resposta;
        this.alternativas = alternativas;
    }

    public String getQuestoes() {
        return questao;
    }

    public void setQuestoes(String questao) {
        this.questao = questao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setAnswer(String resposta) {
        this.resposta = resposta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }
    
    
}
