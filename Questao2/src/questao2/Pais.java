package questao2;

import java.util.ArrayList;

public class Pais {
    private String nome;
    private String capital;
    private String dimensao;
    private  ArrayList<String> paisesFronteira = new ArrayList<>();
    private  ArrayList<String> paises = new ArrayList<>();
    
    public ArrayList<String> getPaisesFronteira() {
        paisesFronteira.add("Paraguai");
        paisesFronteira.add("Uruguai");
        paisesFronteira.add("Peru");
        paisesFronteira.add("Argentina");
        
        return paisesFronteira;
    }
    
    public void setPaisesFronteira(String paisesFronteira) {
        this.paisesFronteira.add(paisesFronteira);
    } 
    
    public ArrayList<String> getPaises() {
        paisesFronteira.add("Paraguai");
        paisesFronteira.add("Uruguai");
        paisesFronteira.add("Brasil");
        paisesFronteira.add("Argentina");
        
        return paises;
    }

    public void setPaises(String paises) {
        this.paises.add(paises);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
}
