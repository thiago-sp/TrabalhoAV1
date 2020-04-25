package trabalhoav1.pkg3;

import java.util.ArrayList;

public class Edificio {
    String cor;
    int totalDeAndares;
    ArrayList<Porta> portas;

    public void Edificio(String cor, int totalDeAndares, ArrayList<Porta> portas){
        this.cor = cor;
        this.totalDeAndares = totalDeAndares;
        this.portas = portas;
    }

    public void Edificio(){
        //Valores padrao.
        portas = new ArrayList<>();
        cor = "azul";
        totalDeAndares = 1;
    }

    void pinta(String cor) {
        this.cor = cor;
    }

    int quantasPortasEstaoAbertas() {
        int qtdPortasAbertas = 0;
        for(int i=0; i<portas.size(); i++) {
            if(portas.get(i).estaAberta()) {
                qtdPortasAbertas++;
            }
        }
        return qtdPortasAbertas;
    }

    void adicionaPorta(Porta porta) {
        this.portas.add(porta);
    }

    int totalDePortas() {
        int i = 0;
        if(portas.get(i).estaAberta() == true);
        return this.portas.size();
    }

    void adicionaAndar() {
        this.totalDeAndares++;
    }

    int totalDeAndares() {
        return this.totalDeAndares;
    }
}
