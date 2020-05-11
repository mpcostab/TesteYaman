public class TesteCarro {

     public static void main(String[] args) {
        Carro fusca = new Carro("Azul", "GTI", 80.0);
        if (fusca.ligaedesliga()) {
            fusca.acelera(60.0);

          System.out.println("Marcha usada: " +fusca.pegaMarcha());
        }
    }
}
