public class Teste {


    public static void main(String[] args){
        Carro fusca = new Carro("Cinza","Fusca",50.0);
        if (fusca.ligaDesliga()) {
            fusca.acelera(60.0);
        }
    }
}