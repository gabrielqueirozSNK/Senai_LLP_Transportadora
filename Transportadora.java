import java.util.Scanner;

public class Transportadora {

    // Método que recebe a interface
    public static double calcularValorFrete(Transporte t, double peso, double alt, double larg, double dist) {
        return t.calcularFrete(peso, alt, larg, dist);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da encomenda:");
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Largura: ");
        double largura = sc.nextDouble();
        System.out.print("Distância: ");
        double distancia = sc.nextDouble();

        Caminhao c = new Caminhao();
        Aviao a = new Aviao();
        PortaContainer p = new PortaContainer();

        System.out.println("\nResultados:");
        System.out.println("Caminhão: R$ " + calcularValorFrete(c, peso, altura, largura, distancia));
        System.out.println("Avião: R$ " + calcularValorFrete(a, peso, altura, largura, distancia));
        System.out.println("Porta-Container: R$ " + calcularValorFrete(p, peso, altura, largura, distancia));

        sc.close();
    }
}