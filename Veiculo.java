public abstract class Veiculo implements Transporte {
    private int anoFabricacao;
    private String marca, modelo, propulsao;

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int ano) { this.anoFabricacao = ano; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getPropulsao() { return propulsao; }
    public void setPropulsao(String propulsao) { this.propulsao = propulsao; }
}