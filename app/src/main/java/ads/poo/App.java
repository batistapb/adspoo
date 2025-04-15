package ads.poo;

public class App {

    public static void main(String[] args) {

        Caneta bic = new Caneta();

        System.out.println(bic.isAberta());

        bic.abrirFechar();

        System.out.println(bic.isAberta());
    }
}
