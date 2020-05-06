import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCarro {

    @Test
    public void testeCor(){
        Carro carro = new Carro("Cinza","Cruze LTZ AT",250.0);
        Assertions.assertEquals("Cinza",carro.getCor());
    }

    @Test
    public void testeModelo(){
        Carro carro = new Carro("Cinza","Cruze LTZ AT",250.0);
        Assertions.assertEquals("Cruze LTZ AT",carro.getModelo());
    }

    @Test
    public void testeVelocidadeMaxima(){
        Carro carro = new Carro("Cinza","Cruze LTZ AT",250.0);
        Assertions.assertEquals(250.0,carro.getVelocidadeMaxima());
    }

}
