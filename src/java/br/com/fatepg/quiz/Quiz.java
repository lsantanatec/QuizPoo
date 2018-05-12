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
    public static ArrayList<Questoes> teste = new ArrayList<Questoes>();
    public static ArrayList<Questoes> questoes = new ArrayList<Questoes>();
    private int qtQuestoes = 5;

        
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
            }while(teste.size()<qtQuestoes);
        /*}
        else{
            System.out.println("Teste não está vazio");
            teste.clear();
        }*/
        return teste;
    }
    
    public static void setTeste(ArrayList<Questoes> aTeste) {
        teste = aTeste;
    }
    
    public static ArrayList<Questoes> getQuestoes() {
        return questoes;
    }
    
    public static void setQuestoes(ArrayList<Questoes> aQuestoes) {
        questoes = aQuestoes;
    }
}