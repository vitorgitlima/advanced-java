package livecode;

import java.util.Objects;

public class Apartamento {

    private String nomeApartamento;
    private Double areaEspecifica;

    public Apartamento(String nomeApartamento, Double areaEspecifica) {
        this.nomeApartamento = nomeApartamento;
        this.areaEspecifica = areaEspecifica;
    }

    public Double getAreaEspecifica() {
        return areaEspecifica;
    }

    public void setAreaEspecifica(Double areaEspecifica) {
        this.areaEspecifica = areaEspecifica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return Objects.equals(nomeApartamento, that.nomeApartamento) &&
               Objects.equals(areaEspecifica, that.areaEspecifica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeApartamento, areaEspecifica);
    }

    @Override
    public String toString() {
        return nomeApartamento + " (Área: " + areaEspecifica + "m²)";
    }
}
