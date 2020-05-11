//PARA A CLASSE MOTO:
//Cor, Cilindradas, qtdMarchas, automatica, ano, modelo, fabricante
//Metodos acelerar e parar
public class Moto {

    public String cor;
    public Integer cilindradas;
    public Integer qtdMarchas;
    public boolean automatica;
    public Integer ano;
    public String modelo;
    public String fabricante;
    public double velocidadeAtual;
    public final double velocidadeMaxima = 150.0;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Integer getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(Integer qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    //Metodo acelerar
    public void acelerar(double velocidade){
        while (this.velocidadeAtual <= this.velocidadeMaxima){
            this.velocidadeAtual += velocidade;
        }
    }
    //Metodo parar
    public void parar(){
            velocidadeAtual = 0.0;
    }
}