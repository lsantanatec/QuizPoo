package br.com.fatepg.quiz;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author André
 */
public class TestesRealizados {
    
    private String nomeUser;
    private Double nota;
    private LocalDate dataTeste;
    
    public static ArrayList<Usuario> last10geral = new ArrayList();
    public static ArrayList<Usuario> melhoresnotas = new ArrayList();
    
    /*public TestesRealizados(String nomeUser, Double nota, LocalDate dataTeste) {
        this.nomeUser = nomeUser;
        this.nota = nota;
        this.dataTeste = dataTeste;
    }*/

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDate getDataTeste() {
        return dataTeste;
    }

    public void setDataTeste(LocalDate dataTeste) {
        this.dataTeste = dataTeste;
    }
}