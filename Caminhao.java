class Caminhao extends VeiculoTerreste {
    private int qtdeEixos;
    private double capacidade;
    private String carroceria;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * (distancia * 6.99);
    }
}