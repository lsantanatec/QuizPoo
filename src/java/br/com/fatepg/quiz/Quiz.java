/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatepg.quiz;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Quiz {
    public static ArrayList<Questoes> teste  = new ArrayList<Questoes>();;
    private static ArrayList<Questoes> questoes = new ArrayList<Questoes>();
    private String user;
    private Double pontuacao;
    public int qtQuestoes = 5;

    public Quiz(){
        
    }
    public Quiz(String user, Double pontuacao){
        this.user = user;
        this.pontuacao = pontuacao;
        System.out.println(user);
        System.out.println(pontuacao);
    }
    
        
    public void inicializarQuestoes(){
        questoes.clear();
        questoes.add(new Questoes("1+2", "3", new String[] {"1", "2", "3"},"N"));
        questoes.add(new Questoes("7+2", "9", new String[] {"5", "9", "1"},"N"));
        questoes.add(new Questoes("1+4", "5", new String[] {"3", "5", "6"},"N"));
        questoes.add(new Questoes("7-2", "5", new String[] {"9", "0", "5"},"N"));
        questoes.add(new Questoes("2+2", "4", new String[] {"4", "0", "2"},"N"));
    }
    
    public ArrayList<Questoes> getTeste(){
        //inicializarQuestoes();
        //if (teste.size()==0){
            teste.clear();
            do{
                int random = (int) (Math.random() * questoes.size());
                if(questoes.get(random).getIndicadorUso().equals("N")){
                    teste.add(questoes.get(random));
                    System.out.println(random + " teste: " +teste.size());
                    questoes.get(random).setIndicadorUso("S");
                }
            }while(teste.size()<getQtQuestoes());
        /*}
        else{
            System.out.println("Teste não está vazio");
            teste.clear();
        }*/
        return teste;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pontuacao
     */
    public Double getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * @return the qtQuestoes
     */
    public int getQtQuestoes() {
        return qtQuestoes;
    }
}