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
    private String      questao;
    private String      resposta;
    private String[]    alternativas;
    private String      indicadorUso;

    public Questoes(String questao, String resposta, String[] alternativas, String indicadorUso) {
        this.questao = questao;
        this.resposta = resposta;
        this.alternativas = alternativas;
        this.indicadorUso = indicadorUso;
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

    public void setAnswer(String resposta) {
        this.resposta = resposta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    /**
     * @return the indicadorUso
     */
    public String getIndicadorUso() {
        return indicadorUso;
    }

    /**
     * @param indicadorUso the indicadorUso to set
     */
    public void setIndicadorUso(String indicadorUso) {
        this.indicadorUso = indicadorUso;
    }
    
    
}
