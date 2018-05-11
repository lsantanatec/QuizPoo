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
    private static ArrayList<Questoes> teste;
    public static ArrayList<Questoes> getTeste(){
        if (teste==null){
            teste = new ArrayList<>();
            teste.add(new Questoes("1+0", "1", new String[] {"1", "2", "3"}));
            teste.add(new Questoes("2+0", "2", new String[] {"2", "9", "1"}));
            teste.add(new Questoes("3+0", "3", new String[] {"3", "5", "6"}));
            teste.add(new Questoes("4+0", "4", new String[] {"4", "0", "5"}));
            teste.add(new Questoes("5+0", "5", new String[] {"5", "0", "2"}));
            teste.add(new Questoes("6+0", "6", new String[] {"6", "2", "3"}));
            teste.add(new Questoes("7+0", "7", new String[] {"7", "9", "1"}));
            teste.add(new Questoes("8+0", "8", new String[] {"8", "5", "6"}));
            teste.add(new Questoes("9-0", "9", new String[] {"9", "0", "5"}));
            teste.add(new Questoes("10+0", "10", new String[] {"10", "0", "2"}));
            teste.add(new Questoes("11+0", "11", new String[] {"11", "2", "3"}));
            teste.add(new Questoes("12+0", "12", new String[] {"12", "9", "1"}));
            teste.add(new Questoes("13+0", "13", new String[] {"13", "5", "6"}));
            teste.add(new Questoes("14+0", "14", new String[] {"14", "0", "5"}));
            teste.add(new Questoes("15+0", "15", new String[] {"15", "0", "2"}));
            teste.add(new Questoes("16+0", "16", new String[] {"16", "2", "3"}));
            teste.add(new Questoes("17+0", "17", new String[] {"17", "9", "1"}));
            teste.add(new Questoes("18+0", "18", new String[] {"18", "5", "6"}));
            teste.add(new Questoes("19+0", "19", new String[] {"19", "0", "5"}));
            teste.add(new Questoes("20+0", "20", new String[] {"20", "0", "2"}));
       
        }
        return teste;
    }
}