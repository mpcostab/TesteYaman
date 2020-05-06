public class Moto {
    public String cor;
    public String placa;
    public Double cilindrada;
    public Double velocidadeMaxima;
    public String combustivel;

    public String getCor(){return this.cor;}
    public String getPlaca(){return this.placa;}
    public Double getCilindrada(){return this.cilindrada;}
    public Double getVelocidadeMaxima(){return this.velocidadeMaxima;}
    public String getCombustivel(){return this.combustivel;}

    public void setCor(String cor){this.cor = cor;}
    public void setPlaca(String placa){this.placa = placa;}
    public void setCilindrada(Double cilindrada){this.cilindrada = cilindrada;}
    public void setVelocidadeMaxima(Double velocidadeMaxima){this.velocidadeMaxima = velocidadeMaxima;}
    public void setCombustivel(String combustivel){this.combustivel = combustivel;}

    public Moto(String cor, String placa, Double cilindrada){
        this.cor = cor;
        this.placa = placa;
        this.cilindrada = cilindrada;
        this.velocidadeMaxima = 330.0;
        this.combustivel = "Gasolina";
    }



}
