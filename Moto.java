public class Moto{
    String nomeDaMoto;
    String cor;
    String cilindradas;
    String qtdMarchas;
    String ano;
    String modelo;
    String fabricante;
    String status;

    public String getNomeDaMoto() {
        return nomeDaMoto;
    }

    public void setNomeDaMoto(String nomeDaMoto) {
        this.nomeDaMoto = nomeDaMoto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(String qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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

    public Moto(String n, String st, String cr, String cilin, String marchas, String an, String model, String fab){
        nomeDaMoto = n;
        cor = cr;
        cilindradas = cilin;
        qtdMarchas = marchas;
        ano = an;
        modelo = model;
        fabricante = fab;
        status = st;
    }

    public void alteraStatus(String st){
        status = st;
    }

    public String verificaStatus(){
        System.out.println( "A moto: "+nomeDaMoto + " está "+status);
        return status;
    }

}