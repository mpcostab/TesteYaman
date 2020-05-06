import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteMoto {

    @Test
    public void testeCor(){
        Moto moto = new Moto("Cinza","FZQ-6175",600.0);
        Assertions.assertEquals("Cinza",moto.getCor());
    }

    @Test
    public void testePlaca(){
        Moto moto = new Moto("Cinza","FZQ-6175",600.0);
        Assertions.assertEquals("FZQ-6175",moto.getPlaca());
    }

    @Test
    public void testeCilindrada(){
        Moto moto = new Moto("Cinza","FZQ-6175",600.0);
        Assertions.assertEquals(600.0,moto.getCilindrada());
    }

    @Test
    public void testeCombustivel(){
        Moto moto = new Moto("Cinza","FZQ-6175",600.0);
        Assertions.assertEquals("Gasolina",moto.getCombustivel());
    }

    @Test
    public void testeVelocidadeMaxima(){
        Moto moto = new Moto("Cinza","FZQ-6175",600.0);
        Assertions.assertEquals(330.0,moto.getVelocidadeMaxima());
    }
}
