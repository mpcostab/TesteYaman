import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Teste {
    private static Carro carro = new Carro(0.0, "Azul", "XPTO", 120);
    private static Moto moto = new Moto();

    @BeforeAll
    public static void iniciaTudo(){
        carro.setCor("Azul");
        carro.setLigado(false);
        carro.setModelo("XPTO");
        carro.setVelocidadeAtual(0.0);
        moto.velocidadeAtual = 0.0;
        moto.ano = 2021;
        moto.automatica = false;
        moto.cilindradas = 200;
        moto.cor = "Preta";
        moto.fabricante = "Honda";
        moto.modelo = "XPTO";
        moto.qtdMarchas = 5;
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("Azul", carro.getCor(), "Cores nao correspondem!");
    }
    @Test
    public void testeLigado(){
        Assertions.assertEquals(false, carro.getLigado(), "Status de ligado/desligado nao corresponde");
    }
    @Test
    public void testeModelo(){
        Assertions.assertEquals("XPTO", carro.getModelo(), "Modelos nao correspondem");
    }
    @Test
    public void testeVelocidadeAtual(){
        Assertions.assertEquals(0.0, carro.getVelocidadeAtual(), "Velocidade atual nao corresponde");
    }
    @Test
    public void testeMotoCilindradas(){
        Assertions.assertEquals(200, moto.getCilindradas(), "Cilindradas nao correspondem");
    }
    @Test
    public void testeMotoAno(){
        Assertions.assertEquals(2021, moto.getAno(), "Anos nao correspondem");
    }
    @Test
    public void testeMotoFabricante(){
        Assertions.assertEquals("Honda", moto.getFabricante(), "Fabricantes nao correspondem");
    }
}