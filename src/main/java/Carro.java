//1 - Solucionar todos os erros de sintaxe.
//2 - Solucionar todos os erros de lógica do código.
//3 - Criar =>3 testes unitarios para o projeto
//​4 - Criar um classe Moto e criem 3 testes para ela
public class Carro {

    public String cor;
    public String modelo;
    public double velocidadeAtual;
    public final double velocidadeMaxima;
    public boolean ligado = false;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public Carro(double velocidadeAtual, String cor, String modelo, double velocidadeMaxima){
        this.velocidadeAtual = 0;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }



    //liga o carro
    public Boolean ligaedesliga() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            this.ligado = false;
            System.out.println("O carro foi desligado");
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
        }
        if (this.velocidadeAtual >= 0.00 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        else{
            return 3;
        }
    }
}