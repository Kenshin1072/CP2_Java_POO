package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean hasBau;

    public Moto(String placa, double capacidade, boolean hasBau) {
        super(placa, capacidade);
        this.setHasBau(hasBau);
    }

    public boolean hasBau() { return this.bau; }

    private void setHasBau(boolean hasBau) {
        this.hasBau = hasBau;
    }
}