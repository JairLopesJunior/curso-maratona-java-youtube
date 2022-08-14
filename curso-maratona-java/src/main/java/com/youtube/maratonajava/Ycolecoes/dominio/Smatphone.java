package com.youtube.maratonajava.Ycolecoes.dominio;

public class Smatphone {

    private String serialNumber;
    private String marca;

    public Smatphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Regras do Equals
    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: Para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: Para x, y, z diferentes de null, se x.equals(y) == true, logo x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // Para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smatphone smatphone = (Smatphone) obj;
        return serialNumber != null && serialNumber.equals(smatphone.serialNumber);
    }

    // Regras do HashCode
    // Se x.equlas(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
