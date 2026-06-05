class PortaContainer extends VeiculoFluvial {
    private int capacidadeTeu;
    private String categoria;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura) * distancia);
    }
}