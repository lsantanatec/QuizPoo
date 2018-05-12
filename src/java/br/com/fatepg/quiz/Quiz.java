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
            teste.add(new Questoes("1+2", "3", new String[] {"1", "2", "3"}));
            teste.add(new Questoes("7+2", "9", new String[] {"5", "9", "1"}));
            teste.add(new Questoes("1+4", "5", new String[] {"3", "5", "6"}));
            teste.add(new Questoes("7-2", "5", new String[] {"9", "0", "5"}));
            teste.add(new Questoes("2+2", "4", new String[] {"4", "0", "2"}));
        }
        return teste;
    }
}