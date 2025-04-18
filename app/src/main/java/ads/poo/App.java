package ads.poo;

public class App {

    public static void main(String[] args) {

        Caneta bic = new Caneta();
        bic.definirNivelTinta(100);

        if(bic.isnivelAtualTinta() > 100 || bic.isnivelAtualTinta() < 0){
            System.out.println("Ocorreu algum problema com a caneta.");
        }
        else{
            System.out.println(bic.isnivelAtualTinta());
        }

       bic.desenhar(1);

        System.out.println(bic.isnivelAtualTinta());

        bic.definirCOr("Preta");
        System.out.println(bic.definirCOr());









    }


}
