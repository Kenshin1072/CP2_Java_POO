package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        if (placa != null) {
            this.placa = placa;
        } else {
            System.out.println("Erro ao anexar a placa!");
        }
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    protected void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}