class Aviao extends VeiculoAereo {
    private double capacidadeCarga, mtow;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return ((peso * peso) * (altura * largura)) * (distancia * 9.99);
    }
}