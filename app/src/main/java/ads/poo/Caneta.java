package ads.poo;

public class Caneta {

    //Atributos
    private String definirCOr;
    private double nivelTinta;
    private boolean aberta;


    //Métodos
    public void definirCOr(String c) {
        definirCOr = c;
    }

    public String definirCOr() {
        return definirCOr;
    }

    public void definirNivelTinta(double n) {
        this.nivelTinta = n;
    }

    public double isnivelAtualTinta(){
        return nivelTinta;

    }

    public void abrirFechar(){
        aberta = !aberta;

    }
    public boolean isAberta(){
        return aberta;
    }

    public String desenhar(int quantidade){

        // 1 if aberta
        // 2 quantos - eu consigo desenhar - cálculo
        // 3 debitar o quantos da tinta
        // 4 return "-".repeat(quantos);

                         


        return "";
    }


}


