package livecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bloco {

    private List<Apartamento> apartamentos;

    public Bloco() {
        this.apartamentos = new ArrayList<>();
    }

    public void adicionarApartamento(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
    }

    public Map<Apartamento, Double> calcularRateio(double valorTotal) {
        Map<Apartamento, Double> rateio = new HashMap<>();

        double areaTotal = calcularAreaTotal();

        for (Apartamento apartamento : apartamentos) {
            double fracaoIdeal = calcularFracaoIdeal(apartamento.getAreaEspecifica(), areaTotal);
            double valorCondominio = fracaoIdeal * valorTotal;
            rateio.put(apartamento, valorCondominio);
        }

        return rateio;
    }

    private double calcularAreaTotal() {
        double total = 0.0;
        for (Apartamento apartamento : apartamentos) {
            total += apartamento.getAreaEspecifica();
        }
        return total;
    }

    private double calcularFracaoIdeal(double areaApartamento, double areaTotal) {
        return areaApartamento / areaTotal;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }
}
