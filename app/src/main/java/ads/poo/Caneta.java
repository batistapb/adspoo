package ads.poo;

public class Caneta {

    //Atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;


    //Métodos
    public void definirCOr(String c) {
        cor = c;
    }

    public void nivelAtualTinta(double t){
        nivelTinta = t;
    }

    public void abrirFechar(){
        aberta = !aberta;

    }
    public boolean isAberta(){
        return aberta;
    }
}
