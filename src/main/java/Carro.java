public class Carro {

    public String cor;
    public String modelo;
    public Double velocidadeAtual;
    public Double velocidadeMaxima;

    public Boolean ligado = false;

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual){ this.velocidadeAtual = velocidadeAtual;}

    public Double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima){this.velocidadeMaxima = velocidadeMaxima;}

    public Boolean getLigado(){
        return this.ligado;
    }

    public Carro(String cor, String modelo, Double velocidadeMaxima){
        this.velocidadeAtual = 0.0;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //liga o carro
    public Boolean ligaDesliga() {
        if (this.ligado){
            this.ligado = false;
            System.out.println("O carro foi desligado");
        } else {
            this.ligado = true;
            System.out.println("O carro foi ligado");
        }
        return this.ligado;
    }
    //acelera uma certa quantidade
    public void acelera(Double quantidade) {
        Double velocidadeNova = this.velocidadeAtual + quantidade;
        if (velocidadeNova < this.velocidadeMaxima){
            this.velocidadeAtual = velocidadeNova;
        }
    }
    //devolve a marcha do carro
    public Integer pegaMarcha() {
        if (this.velocidadeAtual < 0.0) {
            return -1;
        } else if (this.velocidadeAtual >= 0.00 && this.velocidadeAtual < 40) {
            return 1;
        } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        } else {
            return 3;
        }
    }
}