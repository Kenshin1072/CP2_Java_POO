package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacote, Veiculo veiculoUtilizado) {
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public void envio() {
        System.out.println("Levando pacote" + pacote.getCodigo() + " no veiculo de placa: " + veiculoUtilizado.getPlaca());
    }
}