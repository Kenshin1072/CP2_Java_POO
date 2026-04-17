package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean hasBau;

    public Moto(String placa, double capacidade, boolean hasBau) {
        super(placa, capacidade);
        this.setHasBau(hasBau);
    }

    public boolean hasBau() { return this.hasBau; }

    private void setHasBau(boolean hasBau) {
        this.hasBau = hasBau;
    }

    @Override
    protected void setCapacidade(double capacidade) {
        if (capacidade <= 200 && capacidade > 0) {
            super.setCapacidade(capacidade);
        } else {
            System.out.println("Capacidade máxima da moto é 200kg");
            super.setCapacidade(200);
        }
    }
}