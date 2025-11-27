package livecode;

import java.util.Map;

public class CalcularValorCondominio {

    public static void main(String[] args) {

        Bloco bloco = new Bloco();

        Apartamento apartamento1 = new Apartamento("Apto 101", 70.0);
        Apartamento apartamento2 = new Apartamento("Apto 102", 100.0);
        Apartamento apartamento3 = new Apartamento("Apto 103", 50.0);

        bloco.adicionarApartamento(apartamento1);
        bloco.adicionarApartamento(apartamento2);
        bloco.adicionarApartamento(apartamento3);

        double valorTotalDespesas = 1000.0;

        Map<Apartamento, Double> rateio = bloco.calcularRateio(valorTotalDespesas);

        System.out.println("=== RATEIO DE CONDOMÍNIO ===");
        System.out.println("Valor Total das Despesas: R$ " + valorTotalDespesas);
        System.out.println();

        double totalRateado = 0.0;
        for (Map.Entry<Apartamento, Double> entry : rateio.entrySet()) {
            Apartamento apto = entry.getKey();
            Double valor = entry.getValue();

            double areaTotal = bloco.getApartamentos().stream()
                    .mapToDouble(Apartamento::getAreaEspecifica)
                    .sum();
            double fracaoIdeal = apto.getAreaEspecifica() / areaTotal;

            System.out.println(apto);
            System.out.printf("Fração Ideal: %.4f (%.2f%%)\n", fracaoIdeal, fracaoIdeal * 100);
            System.out.printf("Valor do Condomínio: R$ %.2f\n", valor);
            System.out.println();

            totalRateado += valor;
        }

        System.out.printf("Total Rateado: R$ %.2f\n", totalRateado);
    }
}
