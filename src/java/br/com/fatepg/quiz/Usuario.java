
package br.com.fatepg.quiz;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André
 */
public class Usuario{
    
    private String nome;
    private double media;
    private List<Double> last10 = new ArrayList<>();  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia(List<Double> last10) {
        media =0;
        for (int i=0;i<last10.size();i++) {           
            media += last10.get(i);
        }
        media /= last10.size();
        
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Double> getLast10() {
        return last10;
    }

    public void setLast10(List<Double> last10) {
        this.last10 = last10;
    }
    
}
    
    
    
    
    
   