package br.com.fatepg.quiz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author André
 */
public class TestesRealizados {
    
    private Date tRealizado;
    private String nomeUser;
    private Double nota;
    
    private List<Double> last10Geral = new ArrayList<>();
    private List<Double> melhoresNotas = new ArrayList<>();

    public Date gettRealizado() {
        return tRealizado;
    }

    public void settRealizado(Date tRealizado) {
        this.tRealizado = tRealizado;
    }

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

    public List<Double> getLast10Geral() {
        return last10Geral;
    }

    public void setLast10Geral(List<Double> last10Geral) {
        this.last10Geral = last10Geral;
    }

    public List<Double> getMelhoresNotas() {
        return melhoresNotas;
    }

    public void setMelhoresNotas(List<Double> melhoresNotas) {
        this.melhoresNotas = melhoresNotas;
    }
    
    
    
    
    
}
