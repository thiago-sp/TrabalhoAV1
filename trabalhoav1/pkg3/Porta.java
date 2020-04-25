package trabalhoav1.pkg3;

public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;

    public void Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    
    public void Porta(){
        //Atributos padrões apenas para inicialização. Poderiam ser quaisquer outros.
        aberta = false;
        cor = "azul";
        dimensaoX = 2.00;
        dimensaoY = 1.00;
        dimensaoZ = 0.5;
    }

    void abre() {
        this.aberta = true;
    }

    void fecha() {
        this.aberta = false;
    }

    void pinta(String cor) {
        this.cor = cor;
    }

    boolean estaAberta() {
        return aberta;
        }
}



