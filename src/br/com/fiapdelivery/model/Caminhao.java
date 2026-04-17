package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, 0);
        this.setEixos(eixos);
        this.setCapacidade(capacidade);
    }
    public int getEixos() { return this.eixos; }

    private void setEixos(int eixos) {
        if (eixos >= 2 && eixos <= 9) {
            this.eixos = eixos;
        } else {
            System.out.println("Número de eixos inválidos! Usando padrão (2).");
            this.eixos = 2;
        }
    }

    @Override
    protected void setCapacidade(double capacidade) {
        double capacidadeMaxima = this.eixos * 5000;

        if (capacidade <= capacidadeMaxima && capacidade >= 0) {
            super.setCapacidade(capacidade);
        } else {
            System.out.println("Capacidade excede o limite por eixos!");
            super.setCapacidade(capacidadeMaxima);
        }
    }
}